package com.basilus.iracing.manager.model.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a schedule item (race week) in an iRacing season.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleItem {

    @JsonProperty("race_week_num")
    private int raceWeekNum;

    @JsonProperty("track")
    private Track track;

    @JsonProperty("track_name")
    private String trackName;

    @JsonProperty("track_id")
    private int trackId;

    @JsonProperty("time_limit")
    private int timeLimit;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("simulated_time_multiplier")
    private double simulatedTimeMultiplier;

    @JsonProperty("weather_type")
    private String weatherType;

    @JsonProperty("weather_var_initial")
    private int weatherVarInitial;

    @JsonProperty("weather_var_ongoing")
    private int weatherVarOngoing;

    @JsonProperty("track_state_initial")
    private int trackStateInitial;

    @JsonProperty("track_state_qualifying")
    private int trackStateQualifying;

    @JsonProperty("track_state_race")
    private int trackStateRace;

    // Getters and setters

    public int getRaceWeekNum() {
        return raceWeekNum;
    }

    public void setRaceWeekNum(int raceWeekNum) {
        this.raceWeekNum = raceWeekNum;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
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

    public double getSimulatedTimeMultiplier() {
        return simulatedTimeMultiplier;
    }

    public void setSimulatedTimeMultiplier(double simulatedTimeMultiplier) {
        this.simulatedTimeMultiplier = simulatedTimeMultiplier;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public int getWeatherVarInitial() {
        return weatherVarInitial;
    }

    public void setWeatherVarInitial(int weatherVarInitial) {
        this.weatherVarInitial = weatherVarInitial;
    }

    public int getWeatherVarOngoing() {
        return weatherVarOngoing;
    }

    public void setWeatherVarOngoing(int weatherVarOngoing) {
        this.weatherVarOngoing = weatherVarOngoing;
    }

    public int getTrackStateInitial() {
        return trackStateInitial;
    }

    public void setTrackStateInitial(int trackStateInitial) {
        this.trackStateInitial = trackStateInitial;
    }

    public int getTrackStateQualifying() {
        return trackStateQualifying;
    }

    public void setTrackStateQualifying(int trackStateQualifying) {
        this.trackStateQualifying = trackStateQualifying;
    }

    public int getTrackStateRace() {
        return trackStateRace;
    }

    public void setTrackStateRace(int trackStateRace) {
        this.trackStateRace = trackStateRace;
    }
}
