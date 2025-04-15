package com.basilus.iracing.manager.model.results;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the race results response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsResponse {

    @JsonProperty("subsession_id")
    private long subsessionId;

    @JsonProperty("season_id")
    private int seasonId;

    @JsonProperty("season_name")
    private String seasonName;

    @JsonProperty("series_id")
    private int seriesId;

    @JsonProperty("series_name")
    private String seriesName;

    @JsonProperty("race_week_num")
    private int raceWeekNum;

    @JsonProperty("session_id")
    private long sessionId;

    @JsonProperty("license_category_id")
    private int licenseCategoryId;

    @JsonProperty("license_category")
    private String licenseCategory;

    @JsonProperty("track")
    private TrackResult track;

    @JsonProperty("sessions")
    private List<Session> sessions;

    @JsonProperty("num_drivers")
    private int numDrivers;

    @JsonProperty("num_cautions")
    private int numCautions;

    @JsonProperty("num_caution_laps")
    private int numCautionLaps;

    @JsonProperty("num_lead_changes")
    private int numLeadChanges;

    @JsonProperty("event_type")
    private int eventType;

    @JsonProperty("event_type_name")
    private String eventTypeName;

    @JsonProperty("driver_changes")
    private boolean driverChanges;

    @JsonProperty("min_team_drivers")
    private int minTeamDrivers;

    @JsonProperty("max_team_drivers")
    private int maxTeamDrivers;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("corners_per_lap")
    private int cornersPerLap;

    @JsonProperty("caution_type")
    private int cautionType;

    @JsonProperty("caution_type_name")
    private String cautionTypeName;

    @JsonProperty("event_strength_of_field")
    private int eventStrengthOfField;

    @JsonProperty("event_average_lap")
    private int eventAverageLap;

    @JsonProperty("event_laps_complete")
    private int eventLapsComplete;

    // Getters and setters

    public long getSubsessionId() {
        return subsessionId;
    }

    public void setSubsessionId(long subsessionId) {
        this.subsessionId = subsessionId;
    }

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

    public int getRaceWeekNum() {
        return raceWeekNum;
    }

    public void setRaceWeekNum(int raceWeekNum) {
        this.raceWeekNum = raceWeekNum;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public int getLicenseCategoryId() {
        return licenseCategoryId;
    }

    public void setLicenseCategoryId(int licenseCategoryId) {
        this.licenseCategoryId = licenseCategoryId;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public TrackResult getTrack() {
        return track;
    }

    public void setTrack(TrackResult track) {
        this.track = track;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public int getNumDrivers() {
        return numDrivers;
    }

    public void setNumDrivers(int numDrivers) {
        this.numDrivers = numDrivers;
    }

    public int getNumCautions() {
        return numCautions;
    }

    public void setNumCautions(int numCautions) {
        this.numCautions = numCautions;
    }

    public int getNumCautionLaps() {
        return numCautionLaps;
    }

    public void setNumCautionLaps(int numCautionLaps) {
        this.numCautionLaps = numCautionLaps;
    }

    public int getNumLeadChanges() {
        return numLeadChanges;
    }

    public void setNumLeadChanges(int numLeadChanges) {
        this.numLeadChanges = numLeadChanges;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public boolean isDriverChanges() {
        return driverChanges;
    }

    public void setDriverChanges(boolean driverChanges) {
        this.driverChanges = driverChanges;
    }

    public int getMinTeamDrivers() {
        return minTeamDrivers;
    }

    public void setMinTeamDrivers(int minTeamDrivers) {
        this.minTeamDrivers = minTeamDrivers;
    }

    public int getMaxTeamDrivers() {
        return maxTeamDrivers;
    }

    public void setMaxTeamDrivers(int maxTeamDrivers) {
        this.maxTeamDrivers = maxTeamDrivers;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getCornersPerLap() {
        return cornersPerLap;
    }

    public void setCornersPerLap(int cornersPerLap) {
        this.cornersPerLap = cornersPerLap;
    }

    public int getCautionType() {
        return cautionType;
    }

    public void setCautionType(int cautionType) {
        this.cautionType = cautionType;
    }

    public String getCautionTypeName() {
        return cautionTypeName;
    }

    public void setCautionTypeName(String cautionTypeName) {
        this.cautionTypeName = cautionTypeName;
    }

    public int getEventStrengthOfField() {
        return eventStrengthOfField;
    }

    public void setEventStrengthOfField(int eventStrengthOfField) {
        this.eventStrengthOfField = eventStrengthOfField;
    }

    public int getEventAverageLap() {
        return eventAverageLap;
    }

    public void setEventAverageLap(int eventAverageLap) {
        this.eventAverageLap = eventAverageLap;
    }

    public int getEventLapsComplete() {
        return eventLapsComplete;
    }

    public void setEventLapsComplete(int eventLapsComplete) {
        this.eventLapsComplete = eventLapsComplete;
    }
}
