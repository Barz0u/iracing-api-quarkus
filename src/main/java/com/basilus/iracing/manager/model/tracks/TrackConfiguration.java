package com.basilus.iracing.manager.model.tracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a track configuration in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackConfiguration {

    @JsonProperty("track_id")
    private int trackId;

    @JsonProperty("track_name")
    private String trackName;

    @JsonProperty("config_name")
    private String configName;

    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("category")
    private String category;

    @JsonProperty("corners_per_lap")
    private int cornersPerLap;

    @JsonProperty("length_km")
    private double lengthKm;

    @JsonProperty("has_opt_path")
    private boolean hasOptPath;

    // Getters and setters

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCornersPerLap() {
        return cornersPerLap;
    }

    public void setCornersPerLap(int cornersPerLap) {
        this.cornersPerLap = cornersPerLap;
    }

    public double getLengthKm() {
        return lengthKm;
    }

    public void setLengthKm(double lengthKm) {
        this.lengthKm = lengthKm;
    }

    public boolean isHasOptPath() {
        return hasOptPath;
    }

    public void setHasOptPath(boolean hasOptPath) {
        this.hasOptPath = hasOptPath;
    }
}
