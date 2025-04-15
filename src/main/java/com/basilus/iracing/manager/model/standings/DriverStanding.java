package com.basilus.iracing.manager.model.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a driver standing entry from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverStanding {

    @JsonProperty("rank")
    private int rank;

    @JsonProperty("cust_id")
    private int custId;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("division")
    private int division;

    @JsonProperty("club_id")
    private int clubId;

    @JsonProperty("club_name")
    private String clubName;

    @JsonProperty("license_level")
    private int licenseLevel;

    @JsonProperty("license_sub_level")
    private int licenseSubLevel;

    @JsonProperty("points")
    private int points;

    @JsonProperty("dropped_points")
    private int droppedPoints;

    @JsonProperty("starts")
    private int starts;

    @JsonProperty("wins")
    private int wins;

    @JsonProperty("top5")
    private int top5;

    @JsonProperty("top25_percent")
    private int top25Percent;

    @JsonProperty("poles")
    private int poles;

    @JsonProperty("avg_start_position")
    private Double avgStartPosition;

    @JsonProperty("avg_finish_position")
    private Double avgFinishPosition;

    @JsonProperty("avg_field_size")
    private Double avgFieldSize;

    @JsonProperty("laps")
    private int laps;

    @JsonProperty("laps_led")
    private int lapsLed;

    @JsonProperty("incidents")
    private int incidents;

    @JsonProperty("week_results")
    private List<WeekResult> weekResults;

    // Getters and setters

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getLicenseLevel() {
        return licenseLevel;
    }

    public void setLicenseLevel(int licenseLevel) {
        this.licenseLevel = licenseLevel;
    }

    public int getLicenseSubLevel() {
        return licenseSubLevel;
    }

    public void setLicenseSubLevel(int licenseSubLevel) {
        this.licenseSubLevel = licenseSubLevel;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDroppedPoints() {
        return droppedPoints;
    }

    public void setDroppedPoints(int droppedPoints) {
        this.droppedPoints = droppedPoints;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getTop5() {
        return top5;
    }

    public void setTop5(int top5) {
        this.top5 = top5;
    }

    public int getTop25Percent() {
        return top25Percent;
    }

    public void setTop25Percent(int top25Percent) {
        this.top25Percent = top25Percent;
    }

    public int getPoles() {
        return poles;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }

    public Double getAvgStartPosition() {
        return avgStartPosition;
    }

    public void setAvgStartPosition(Double avgStartPosition) {
        this.avgStartPosition = avgStartPosition;
    }

    public Double getAvgFinishPosition() {
        return avgFinishPosition;
    }

    public void setAvgFinishPosition(Double avgFinishPosition) {
        this.avgFinishPosition = avgFinishPosition;
    }

    public Double getAvgFieldSize() {
        return avgFieldSize;
    }

    public void setAvgFieldSize(Double avgFieldSize) {
        this.avgFieldSize = avgFieldSize;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public int getLapsLed() {
        return lapsLed;
    }

    public void setLapsLed(int lapsLed) {
        this.lapsLed = lapsLed;
    }

    public int getIncidents() {
        return incidents;
    }

    public void setIncidents(int incidents) {
        this.incidents = incidents;
    }

    public List<WeekResult> getWeekResults() {
        return weekResults;
    }

    public void setWeekResults(List<WeekResult> weekResults) {
        this.weekResults = weekResults;
    }
}
