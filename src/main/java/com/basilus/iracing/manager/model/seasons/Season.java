package com.basilus.iracing.manager.model.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a season in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Season {

    @JsonProperty("season_id")
    private int seasonId;

    @JsonProperty("season_name")
    private String seasonName;

    @JsonProperty("season_short_name")
    private String seasonShortName;

    @JsonProperty("season_year")
    private int seasonYear;

    @JsonProperty("season_quarter")
    private int seasonQuarter;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("license_group")
    private String licenseGroup;

    @JsonProperty("license_group_id")
    private int licenseGroupId;

    @JsonProperty("race_week_count")
    private int raceWeekCount;

    @JsonProperty("track_types")
    private List<String> trackTypes;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("season_schedule")
    private List<ScheduleItem> seasonSchedule;

    @JsonProperty("car_classes")
    private List<CarClass> carClasses;

    @JsonProperty("cars_in_season_count")
    private int carsInSeasonCount;

    @JsonProperty("min_license_level")
    private int minLicenseLevel;

    @JsonProperty("series_id")
    private int seriesId;

    // Getters and setters

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonShortName() {
        return seasonShortName;
    }

    public void setSeasonShortName(String seasonShortName) {
        this.seasonShortName = seasonShortName;
    }

    public int getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(int seasonYear) {
        this.seasonYear = seasonYear;
    }

    public int getSeasonQuarter() {
        return seasonQuarter;
    }

    public void setSeasonQuarter(int seasonQuarter) {
        this.seasonQuarter = seasonQuarter;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public int getRaceWeekCount() {
        return raceWeekCount;
    }

    public void setRaceWeekCount(int raceWeekCount) {
        this.raceWeekCount = raceWeekCount;
    }

    public List<String> getTrackTypes() {
        return trackTypes;
    }

    public void setTrackTypes(List<String> trackTypes) {
        this.trackTypes = trackTypes;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<ScheduleItem> getSeasonSchedule() {
        return seasonSchedule;
    }

    public void setSeasonSchedule(List<ScheduleItem> seasonSchedule) {
        this.seasonSchedule = seasonSchedule;
    }

    public List<CarClass> getCarClasses() {
        return carClasses;
    }

    public void setCarClasses(List<CarClass> carClasses) {
        this.carClasses = carClasses;
    }

    public int getCarsInSeasonCount() {
        return carsInSeasonCount;
    }

    public void setCarsInSeasonCount(int carsInSeasonCount) {
        this.carsInSeasonCount = carsInSeasonCount;
    }

    public int getMinLicenseLevel() {
        return minLicenseLevel;
    }

    public void setMinLicenseLevel(int minLicenseLevel) {
        this.minLicenseLevel = minLicenseLevel;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }
}
