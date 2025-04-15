package com.basilus.iracing.manager.model.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the driver standings response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverStandingsResponse {

    @JsonProperty("season_id")
    private int seasonId;

    @JsonProperty("season_name")
    private String seasonName;

    @JsonProperty("season_short_name")
    private String seasonShortName;

    @JsonProperty("car_class_id")
    private int carClassId;

    @JsonProperty("car_class_name")
    private String carClassName;

    @JsonProperty("race_week_num")
    private int raceWeekNum;

    @JsonProperty("points_system_id")
    private int pointsSystemId;

    @JsonProperty("points_system_name")
    private String pointsSystemName;

    @JsonProperty("drivers")
    private List<DriverStanding> drivers;

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

    public int getRaceWeekNum() {
        return raceWeekNum;
    }

    public void setRaceWeekNum(int raceWeekNum) {
        this.raceWeekNum = raceWeekNum;
    }

    public int getPointsSystemId() {
        return pointsSystemId;
    }

    public void setPointsSystemId(int pointsSystemId) {
        this.pointsSystemId = pointsSystemId;
    }

    public String getPointsSystemName() {
        return pointsSystemName;
    }

    public void setPointsSystemName(String pointsSystemName) {
        this.pointsSystemName = pointsSystemName;
    }

    public List<DriverStanding> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverStanding> drivers) {
        this.drivers = drivers;
    }
}
