package com.basilus.iracing.manager.service;

import com.basilus.iracing.manager.model.stats.CategoryStats;
import com.basilus.iracing.manager.model.stats.DriverStatsResponse;
import com.basilus.iracing.manager.model.tracking.RaceChange;
import com.basilus.iracing.manager.model.tracking.TrackedMember;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Service responsible for tracking race changes for members.
 * Automatically checks for new races every hour.
 */
@ApplicationScoped
public class RaceTrackingService {

    private static final Logger LOG = Logger.getLogger(RaceTrackingService.class);

    @Inject
    IracingService iracingService;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Map<Integer, TrackedMember> trackedMembers = new ConcurrentHashMap<>();
    private final List<RaceChange> recentChanges = new ArrayList<>();

    /**
     * Start tracking a member by their customer ID.
     *
     * @param custId      The customer ID of the member to track
     * @param displayName The display name of the member (optional)
     * @return true if member was successfully added for tracking, false if already tracked
     */
    public boolean trackMember(int custId, String displayName) {
        if (trackedMembers.containsKey(custId)) {
            return false;
        }

        TrackedMember member = new TrackedMember(custId, displayName);

        try {
            // Initial fetch of stats to establish baseline
            updateMemberStats(member);
            trackedMembers.put(custId, member);
            LOG.info("Started tracking member: " + displayName + " (" + custId + ")");
            return true;
        } catch (Exception e) {
            LOG.error("Failed to start tracking member: " + custId, e);
            return false;
        }
    }

    /**
     * Stop tracking a member.
     *
     * @param custId The customer ID of the member to stop tracking
     * @return true if member was successfully removed from tracking, false if not tracked
     */
    public boolean stopTrackingMember(int custId) {
        TrackedMember removed = trackedMembers.remove(custId);
        if (removed != null) {
            LOG.info("Stopped tracking member: " + removed.getDisplayName() + " (" + custId + ")");
            return true;
        }
        return false;
    }

    /**
     * Get a list of all currently tracked members.
     *
     * @return List of tracked members
     */
    public List<TrackedMember> getTrackedMembers() {
        return new ArrayList<>(trackedMembers.values());
    }

    /**
     * Get recent race changes that have been detected.
     *
     * @return List of recent race changes
     */
    public List<RaceChange> getRecentChanges() {
        return new ArrayList<>(recentChanges);
    }

    /**
     * Clear the list of recent changes.
     */
    public void clearRecentChanges() {
        recentChanges.clear();
    }

    /**
     * Scheduled task that runs every hour to check for race changes.
     */
    @Scheduled(every = "1h")
    void checkForRaceChanges() {
        LOG.info("Running scheduled check for race changes. Tracking " + trackedMembers.size() + " members.");

        for (TrackedMember member : trackedMembers.values()) {
            try {
                Map<Integer, List<CategoryStats>> previousStats = member.getPreviousStats();
                List<RaceChange> changes = updateMemberStats(member);

                if (!changes.isEmpty()) {
                    for (RaceChange change : changes) {
                        LOG.info(change.toString());
                        recentChanges.add(change);
                    }
                }
            } catch (Exception e) {
                LOG.error("Error checking for race changes for member: " + member.getCustId(), e);
            }
        }
    }

    /**
     * Update member stats and detect changes.
     *
     * @param member The member to update stats for
     * @return List of detected race changes
     */
    private List<RaceChange> updateMemberStats(TrackedMember member) throws Exception {
        List<RaceChange> changes = new ArrayList<>();
        String custId = String.valueOf(member.getCustId());
        String statsJson = iracingService.getMemberCareerStats(custId);

        DriverStatsResponse stats = objectMapper.readValue(statsJson, DriverStatsResponse.class);
        Map<Integer, List<CategoryStats>> previousStats = member.getPreviousStats();

        // Check for changes in each category
        for (CategoryStats category : stats.getStats()) {
            int categoryId = category.getCategoryId();

            // If we have previous stats for this category, check for changes
            if (previousStats.containsKey(categoryId)) {
                CategoryStats previousCategory = findCategoryStats(previousStats.get(categoryId), categoryId);

                if (previousCategory != null && category.getStarts() > previousCategory.getStarts()) {
                    // New races detected
                    RaceChange change = new RaceChange(
                            member.getCustId(),
                            member.getDisplayName(),
                            categoryId,
                            category.getCategory(),
                            previousCategory.getStarts(),
                            category.getStarts(),
                            previousCategory.getWins(),
                            category.getWins(),
                            previousCategory.getTop5(),
                            category.getTop5()
                    );

                    changes.add(change);
                }
            }
        }

        // Update previous stats with current stats
        member.getPreviousStats().put(stats.getCustId(), stats.getStats());
        member.updateLastChecked();

        return changes;
    }

    /**
     * Find category stats by category ID in a list of category stats.
     *
     * @param categoryStats List of category stats
     * @param categoryId    Category ID to find
     * @return CategoryStats if found, null otherwise
     */
    private CategoryStats findCategoryStats(List<CategoryStats> categoryStats, int categoryId) {
        if (categoryStats == null) {
            return null;
        }

        for (CategoryStats stats : categoryStats) {
            if (stats.getCategoryId() == categoryId) {
                return stats;
            }
        }

        return null;
    }

    /**
     * Manually trigger a check for race changes.
     *
     * @return List of detected race changes
     */
    public List<RaceChange> manualCheck() {
        LOG.info("Manually checking for race changes. Tracking " + trackedMembers.size() + " members.");
        List<RaceChange> allChanges = new ArrayList<>();

        for (TrackedMember member : trackedMembers.values()) {
            try {
                List<RaceChange> changes = updateMemberStats(member);

                if (!changes.isEmpty()) {
                    for (RaceChange change : changes) {
                        LOG.info(change.toString());
                        recentChanges.add(change);
                    }

                    allChanges.addAll(changes);
                }
            } catch (Exception e) {
                LOG.error("Error checking for race changes for member: " + member.getCustId(), e);
            }
        }

        return allChanges;
    }
}
