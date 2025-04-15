package com.basilus.iracing.manager.model.championship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents championship data for a specific car class from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionshipData {

    @JsonProperty("car_class_id")
    private int carClassId;

    @JsonProperty("car_class_name")
    private String carClassName;

    @JsonProperty("division_data")
    private List<DivisionData> divisionData;

    // Getters and setters

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

    public List<DivisionData> getDivisionData() {
        return divisionData;
    }

    public void setDivisionData(List<DivisionData> divisionData) {
        this.divisionData = divisionData;
    }
}
