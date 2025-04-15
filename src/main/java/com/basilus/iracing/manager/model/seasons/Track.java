package com.basilus.iracing.manager.model.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a track in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {

    @JsonProperty("track_id")
    private int trackId;

    @JsonProperty("track_name")
    private String trackName;

    @JsonProperty("config_name")
    private String configName;

    @JsonProperty("track_config_length")
    private String trackConfigLength;

    @JsonProperty("category")
    private String category;

    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("corners_per_lap")
    private int cornersPerLap;

    @JsonProperty("track_price")
    private double trackPrice;

    @JsonProperty("track_climate")
    private String trackClimate;

    @JsonProperty("grid_stalls")
    private int gridStalls;

    @JsonProperty("has_opt_path")
    private boolean hasOptPath;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("search_filters")
    private String searchFilters;

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

    public String getTrackConfigLength() {
        return trackConfigLength;
    }

    public void setTrackConfigLength(String trackConfigLength) {
        this.trackConfigLength = trackConfigLength;
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

    public int getCornersPerLap() {
        return cornersPerLap;
    }

    public void setCornersPerLap(int cornersPerLap) {
        this.cornersPerLap = cornersPerLap;
    }

    public double getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
    }

    public String getTrackClimate() {
        return trackClimate;
    }

    public void setTrackClimate(String trackClimate) {
        this.trackClimate = trackClimate;
    }

    public int getGridStalls() {
        return gridStalls;
    }

    public void setGridStalls(int gridStalls) {
        this.gridStalls = gridStalls;
    }

    public boolean isHasOptPath() {
        return hasOptPath;
    }

    public void setHasOptPath(boolean hasOptPath) {
        this.hasOptPath = hasOptPath;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getSearchFilters() {
        return searchFilters;
    }

    public void setSearchFilters(String searchFilters) {
        this.searchFilters = searchFilters;
    }
}
