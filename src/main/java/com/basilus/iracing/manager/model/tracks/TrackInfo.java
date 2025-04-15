package com.basilus.iracing.manager.model.tracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents detailed track information in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackInfo {

    @JsonProperty("track_id")
    private int trackId;

    @JsonProperty("track_name")
    private String trackName;

    @JsonProperty("track_name_full")
    private String trackNameFull;

    @JsonProperty("config_name")
    private String configName;

    @JsonProperty("track_name_with_config")
    private String trackNameWithConfig;

    @JsonProperty("category")
    private String category;

    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("has_local_mapping")
    private boolean hasLocalMapping;

    @JsonProperty("has_dynamic_weather")
    private boolean hasDynamicWeather;

    @JsonProperty("has_dynamic_time")
    private boolean hasDynamicTime;

    @JsonProperty("has_race_beacon")
    private boolean hasRaceBeacon;

    @JsonProperty("has_pace_car")
    private boolean hasPaceCar;

    @JsonProperty("has_race_control")
    private boolean hasRaceControl;

    @JsonProperty("location")
    private String location;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("track_map_layers")
    private List<TrackMapLayer> trackMapLayers;

    @JsonProperty("configurations")
    private List<TrackConfiguration> configurations;

    @JsonProperty("time_zones")
    private List<String> timeZones;

    @JsonProperty("price")
    private double price;

    @JsonProperty("is_free")
    private boolean isFree;

    @JsonProperty("is_legacy")
    private boolean isLegacy;

    @JsonProperty("is_dirt")
    private boolean isDirt;

    @JsonProperty("is_oval")
    private boolean isOval;

    @JsonProperty("is_empty")
    private boolean isEmpty;

    @JsonProperty("length_km")
    private double lengthKm;

    @JsonProperty("corners_per_lap")
    private int cornersPerLap;

    @JsonProperty("pitroad_speed_limit_kph")
    private int pitroadSpeedLimitKph;

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

    public String getTrackNameFull() {
        return trackNameFull;
    }

    public void setTrackNameFull(String trackNameFull) {
        this.trackNameFull = trackNameFull;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getTrackNameWithConfig() {
        return trackNameWithConfig;
    }

    public void setTrackNameWithConfig(String trackNameWithConfig) {
        this.trackNameWithConfig = trackNameWithConfig;
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

    public boolean isHasLocalMapping() {
        return hasLocalMapping;
    }

    public void setHasLocalMapping(boolean hasLocalMapping) {
        this.hasLocalMapping = hasLocalMapping;
    }

    public boolean isHasDynamicWeather() {
        return hasDynamicWeather;
    }

    public void setHasDynamicWeather(boolean hasDynamicWeather) {
        this.hasDynamicWeather = hasDynamicWeather;
    }

    public boolean isHasDynamicTime() {
        return hasDynamicTime;
    }

    public void setHasDynamicTime(boolean hasDynamicTime) {
        this.hasDynamicTime = hasDynamicTime;
    }

    public boolean isHasRaceBeacon() {
        return hasRaceBeacon;
    }

    public void setHasRaceBeacon(boolean hasRaceBeacon) {
        this.hasRaceBeacon = hasRaceBeacon;
    }

    public boolean isHasPaceCar() {
        return hasPaceCar;
    }

    public void setHasPaceCar(boolean hasPaceCar) {
        this.hasPaceCar = hasPaceCar;
    }

    public boolean isHasRaceControl() {
        return hasRaceControl;
    }

    public void setHasRaceControl(boolean hasRaceControl) {
        this.hasRaceControl = hasRaceControl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public List<TrackMapLayer> getTrackMapLayers() {
        return trackMapLayers;
    }

    public void setTrackMapLayers(List<TrackMapLayer> trackMapLayers) {
        this.trackMapLayers = trackMapLayers;
    }

    public List<TrackConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<TrackConfiguration> configurations) {
        this.configurations = configurations;
    }

    public List<String> getTimeZones() {
        return timeZones;
    }

    public void setTimeZones(List<String> timeZones) {
        this.timeZones = timeZones;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isLegacy() {
        return isLegacy;
    }

    public void setLegacy(boolean legacy) {
        isLegacy = legacy;
    }

    public boolean isDirt() {
        return isDirt;
    }

    public void setDirt(boolean dirt) {
        isDirt = dirt;
    }

    public boolean isOval() {
        return isOval;
    }

    public void setOval(boolean oval) {
        isOval = oval;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public double getLengthKm() {
        return lengthKm;
    }

    public void setLengthKm(double lengthKm) {
        this.lengthKm = lengthKm;
    }

    public int getCornersPerLap() {
        return cornersPerLap;
    }

    public void setCornersPerLap(int cornersPerLap) {
        this.cornersPerLap = cornersPerLap;
    }

    public int getPitroadSpeedLimitKph() {
        return pitroadSpeedLimitKph;
    }

    public void setPitroadSpeedLimitKph(int pitroadSpeedLimitKph) {
        this.pitroadSpeedLimitKph = pitroadSpeedLimitKph;
    }

    public boolean isHasOptPath() {
        return hasOptPath;
    }

    public void setHasOptPath(boolean hasOptPath) {
        this.hasOptPath = hasOptPath;
    }
}
