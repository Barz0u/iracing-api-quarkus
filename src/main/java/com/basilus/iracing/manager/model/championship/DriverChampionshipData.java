package com.basilus.iracing.manager.model.championship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents championship data for a specific driver from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverChampionshipData {

    @JsonProperty("cust_id")
    private int custId;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("club_id")
    private int clubId;

    @JsonProperty("club_name")
    private String clubName;

    @JsonProperty("license_class")
    private int licenseClass;

    @JsonProperty("irating")
    private int irating;

    @JsonProperty("division")
    private int division;

    @JsonProperty("rank")
    private int rank;

    @JsonProperty("points")
    private int points;

    @JsonProperty("dropped_points")
    private int droppedPoints;

    @JsonProperty("total_points")
    private int totalPoints;

    @JsonProperty("weeks_counted")
    private int weeksCounted;

    @JsonProperty("starts")
    private int starts;

    @JsonProperty("wins")
    private int wins;

    @JsonProperty("top5")
    private int top5;

    @JsonProperty("laps")
    private int laps;

    @JsonProperty("laps_led")
    private int lapsLed;

    @JsonProperty("incidents")
    private int incidents;

    @JsonProperty("week_data")
    private int[] weekData;

    // Getters and setters

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

    public int getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(int licenseClass) {
        this.licenseClass = licenseClass;
    }

    public int getIrating() {
        return irating;
    }

    public void setIrating(int irating) {
        this.irating = irating;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getWeeksCounted() {
        return weeksCounted;
    }

    public void setWeeksCounted(int weeksCounted) {
        this.weeksCounted = weeksCounted;
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

    public int[] getWeekData() {
        return weekData;
    }

    public void setWeekData(int[] weekData) {
        this.weekData = weekData;
    }
}
