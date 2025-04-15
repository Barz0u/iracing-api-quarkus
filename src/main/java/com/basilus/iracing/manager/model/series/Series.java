package com.basilus.iracing.manager.model.series;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a series in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Series {

    @JsonProperty("series_id")
    private int seriesId;

    @JsonProperty("series_name")
    private String seriesName;

    @JsonProperty("series_short_name")
    private String seriesShortName;

    @JsonProperty("category")
    private String category;

    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("official")
    private boolean official;

    @JsonProperty("fixed_setup")
    private boolean fixedSetup;

    @JsonProperty("license_group")
    private String licenseGroup;

    @JsonProperty("license_group_id")
    private int licenseGroupId;

    @JsonProperty("min_license_level")
    private int minLicenseLevel;

    @JsonProperty("is_heat_racing")
    private boolean isHeatRacing;

    @JsonProperty("oval_caution_type")
    private int ovalCautionType;

    @JsonProperty("road_caution_type")
    private int roadCautionType;

    @JsonProperty("allow_pitlane_collisions")
    private boolean allowPitlaneCollisions;

    @JsonProperty("allow_qualifying_collisions")
    private boolean allowQualifyingCollisions;

    @JsonProperty("current_season_count")
    private int currentSeasonCount;

    @JsonProperty("recent_season_count")
    private int recentSeasonCount;

    @JsonProperty("season_mode")
    private int seasonMode;

    // Getters and setters

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getSeriesShortName() {
        return seriesShortName;
    }

    public void setSeriesShortName(String seriesShortName) {
        this.seriesShortName = seriesShortName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public boolean isFixedSetup() {
        return fixedSetup;
    }

    public void setFixedSetup(boolean fixedSetup) {
        this.fixedSetup = fixedSetup;
    }

    public String getLicenseGroup() {
        return licenseGroup;
    }

    public void setLicenseGroup(String licenseGroup) {
        this.licenseGroup = licenseGroup;
    }

    public int getLicenseGroupId() {
        return licenseGroupId;
    }

    public void setLicenseGroupId(int licenseGroupId) {
        this.licenseGroupId = licenseGroupId;
    }

    public int getMinLicenseLevel() {
        return minLicenseLevel;
    }

    public void setMinLicenseLevel(int minLicenseLevel) {
        this.minLicenseLevel = minLicenseLevel;
    }

    public boolean isHeatRacing() {
        return isHeatRacing;
    }

    public void setHeatRacing(boolean heatRacing) {
        isHeatRacing = heatRacing;
    }

    public int getOvalCautionType() {
        return ovalCautionType;
    }

    public void setOvalCautionType(int ovalCautionType) {
        this.ovalCautionType = ovalCautionType;
    }

    public int getRoadCautionType() {
        return roadCautionType;
    }

    public void setRoadCautionType(int roadCautionType) {
        this.roadCautionType = roadCautionType;
    }

    public boolean isAllowPitlaneCollisions() {
        return allowPitlaneCollisions;
    }

    public void setAllowPitlaneCollisions(boolean allowPitlaneCollisions) {
        this.allowPitlaneCollisions = allowPitlaneCollisions;
    }

    public boolean isAllowQualifyingCollisions() {
        return allowQualifyingCollisions;
    }

    public void setAllowQualifyingCollisions(boolean allowQualifyingCollisions) {
        this.allowQualifyingCollisions = allowQualifyingCollisions;
    }

    public int getCurrentSeasonCount() {
        return currentSeasonCount;
    }

    public void setCurrentSeasonCount(int currentSeasonCount) {
        this.currentSeasonCount = currentSeasonCount;
    }

    public int getRecentSeasonCount() {
        return recentSeasonCount;
    }

    public void setRecentSeasonCount(int recentSeasonCount) {
        this.recentSeasonCount = recentSeasonCount;
    }

    public int getSeasonMode() {
        return seasonMode;
    }

    public void setSeasonMode(int seasonMode) {
        this.seasonMode = seasonMode;
    }
}
