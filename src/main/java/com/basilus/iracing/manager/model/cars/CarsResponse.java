package com.basilus.iracing.manager.model.cars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the cars response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarsResponse {

    @JsonProperty("cars")
    private List<CarInfo> cars;

    public List<CarInfo> getCars() {
        return cars;
    }

    public void setCars(List<CarInfo> cars) {
        this.cars = cars;
    }
}
