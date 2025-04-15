package com.basilus.iracing.manager.model.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a car class in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarClass {

    @JsonProperty("car_class_id")
    private int carClassId;

    @JsonProperty("car_class_name")
    private String carClassName;

    @JsonProperty("short_name")
    private String shortName;

    @JsonProperty("relative_speed")
    private int relativeSpeed;

    @JsonProperty("cars")
    private List<Car> cars;

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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getRelativeSpeed() {
        return relativeSpeed;
    }

    public void setRelativeSpeed(int relativeSpeed) {
        this.relativeSpeed = relativeSpeed;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
