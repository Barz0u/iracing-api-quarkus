package com.basilus.iracing.manager.model.results;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents track information within race results from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackResult {

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
}
