package com.basilus.iracing.manager.model.results;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an individual race result entry from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @JsonProperty("cust_id")
    private int custId;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("finish_position")
    private int finishPosition;

    @JsonProperty("finish_position_in_class")
    private int finishPositionInClass;

    @JsonProperty("laps_lead")
    private int lapsLead;

    @JsonProperty("laps_complete")
    private int lapsComplete;

    @JsonProperty("fastest_lap_time")
    private int fastestLapTime;

    @JsonProperty("average_lap_time")
    private int averageLapTime;

    @JsonProperty("incidents")
    private int incidents;

    @JsonProperty("car_id")
    private int carId;

    @JsonProperty("car_name")
    private String carName;

    @JsonProperty("car_class_id")
    private int carClassId;

    @JsonProperty("car_class_name")
    private String carClassName;

    @JsonProperty("club_id")
    private int clubId;

    @JsonProperty("club_name")
    private String clubName;

    @JsonProperty("division")
    private int division;

    @JsonProperty("old_license_level")
    private int oldLicenseLevel;

    @JsonProperty("old_license_sub_level")
    private int oldLicenseSubLevel;

    @JsonProperty("old_safety_rating")
    private double oldSafetyRating;

    @JsonProperty("new_license_level")
    private int newLicenseLevel;

    @JsonProperty("new_license_sub_level")
    private int newLicenseSubLevel;

    @JsonProperty("new_safety_rating")
    private double newSafetyRating;

    @JsonProperty("old_irating")
    private int oldIrating;

    @JsonProperty("new_irating")
    private int newIrating;

    @JsonProperty("reason_out_id")
    private int reasonOutId;

    @JsonProperty("reason_out")
    private String reasonOut;

    @JsonProperty("interval")
    private ResultInterval interval;

    @JsonProperty("championship_points")
    private int championshipPoints;

    @JsonProperty("team_id")
    private int teamId;

    @JsonProperty("team_name")
    private String teamName;

    @JsonProperty("starting_position")
    private int startingPosition;

    @JsonProperty("starting_position_in_class")
    private int startingPositionInClass;

    @JsonProperty("car_number")
    private String carNumber;

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

    public int getFinishPosition() {
        return finishPosition;
    }

    public void setFinishPosition(int finishPosition) {
        this.finishPosition = finishPosition;
    }

    public int getFinishPositionInClass() {
        return finishPositionInClass;
    }

    public void setFinishPositionInClass(int finishPositionInClass) {
        this.finishPositionInClass = finishPositionInClass;
    }

    public int getLapsLead() {
        return lapsLead;
    }

    public void setLapsLead(int lapsLead) {
        this.lapsLead = lapsLead;
    }

    public int getLapsComplete() {
        return lapsComplete;
    }

    public void setLapsComplete(int lapsComplete) {
        this.lapsComplete = lapsComplete;
    }

    public int getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(int fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public int getAverageLapTime() {
        return averageLapTime;
    }

    public void setAverageLapTime(int averageLapTime) {
        this.averageLapTime = averageLapTime;
    }

    public int getIncidents() {
        return incidents;
    }

    public void setIncidents(int incidents) {
        this.incidents = incidents;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarClassId() {
        return carClassId;
    }

    public void setCarClassId(int carClassId) {
        this.carClassId = carClassId;
    }

    public String getCarClassName() {
        return carClassName;
    }

    public void setCarClassName(String carClassName) {
        this.carClassName = carClassName;
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

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getOldLicenseLevel() {
        return oldLicenseLevel;
    }

    public void setOldLicenseLevel(int oldLicenseLevel) {
        this.oldLicenseLevel = oldLicenseLevel;
    }

    public int getOldLicenseSubLevel() {
        return oldLicenseSubLevel;
    }

    public void setOldLicenseSubLevel(int oldLicenseSubLevel) {
        this.oldLicenseSubLevel = oldLicenseSubLevel;
    }

    public double getOldSafetyRating() {
        return oldSafetyRating;
    }

    public void setOldSafetyRating(double oldSafetyRating) {
        this.oldSafetyRating = oldSafetyRating;
    }

    public int getNewLicenseLevel() {
        return newLicenseLevel;
    }

    public void setNewLicenseLevel(int newLicenseLevel) {
        this.newLicenseLevel = newLicenseLevel;
    }

    public int getNewLicenseSubLevel() {
        return newLicenseSubLevel;
    }

    public void setNewLicenseSubLevel(int newLicenseSubLevel) {
        this.newLicenseSubLevel = newLicenseSubLevel;
    }

    public double getNewSafetyRating() {
        return newSafetyRating;
    }

    public void setNewSafetyRating(double newSafetyRating) {
        this.newSafetyRating = newSafetyRating;
    }

    public int getOldIrating() {
        return oldIrating;
    }

    public void setOldIrating(int oldIrating) {
        this.oldIrating = oldIrating;
    }

    public int getNewIrating() {
        return newIrating;
    }

    public void setNewIrating(int newIrating) {
        this.newIrating = newIrating;
    }

    public int getReasonOutId() {
        return reasonOutId;
    }

    public void setReasonOutId(int reasonOutId) {
        this.reasonOutId = reasonOutId;
    }

    public String getReasonOut() {
        return reasonOut;
    }

    public void setReasonOut(String reasonOut) {
        this.reasonOut = reasonOut;
    }

    public ResultInterval getInterval() {
        return interval;
    }

    public void setInterval(ResultInterval interval) {
        this.interval = interval;
    }

    public int getChampionshipPoints() {
        return championshipPoints;
    }

    public void setChampionshipPoints(int championshipPoints) {
        this.championshipPoints = championshipPoints;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(int startingPosition) {
        this.startingPosition = startingPosition;
    }

    public int getStartingPositionInClass() {
        return startingPositionInClass;
    }

    public void setStartingPositionInClass(int startingPositionInClass) {
        this.startingPositionInClass = startingPositionInClass;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
