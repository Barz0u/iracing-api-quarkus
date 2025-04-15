package com.basilus.iracing.manager.model.championship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents championship data for a specific division from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DivisionData {

    @JsonProperty("division")
    private int division;

    @JsonProperty("drivers")
    private List<DriverChampionshipData> drivers;

    // Getters and setters

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public List<DriverChampionshipData> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverChampionshipData> drivers) {
        this.drivers = drivers;
    }
}
