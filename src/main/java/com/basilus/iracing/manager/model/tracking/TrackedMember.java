package com.basilus.iracing.manager.model.tracking;

import com.basilus.iracing.manager.model.stats.CategoryStats;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Represents a member whose career data is being tracked for changes.
 */
public class TrackedMember {
    private int custId;
    private String displayName;
    private LocalDateTime lastChecked;
    private Map<Integer, List<CategoryStats>> previousStats;

    public TrackedMember(int custId, String displayName) {
        this.custId = custId;
        this.displayName = displayName;
        this.lastChecked = LocalDateTime.now();
        this.previousStats = new ConcurrentHashMap<>();
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public LocalDateTime getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(LocalDateTime lastChecked) {
        this.lastChecked = lastChecked;
    }

    public Map<Integer, List<CategoryStats>> getPreviousStats() {
        return previousStats;
    }

    public void setPreviousStats(Map<Integer, List<CategoryStats>> previousStats) {
        this.previousStats = previousStats;
    }

    public void updateLastChecked() {
        this.lastChecked = LocalDateTime.now();
    }
}
