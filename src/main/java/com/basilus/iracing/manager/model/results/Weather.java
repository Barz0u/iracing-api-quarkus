package com.basilus.iracing.manager.model.results;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents weather information in race results from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    @JsonProperty("type")
    private int type;

    @JsonProperty("type_name")
    private String typeName;

    @JsonProperty("temp_units")
    private int tempUnits;

    @JsonProperty("temp_value")
    private int tempValue;

    @JsonProperty("temp_units_name")
    private String tempUnitsName;

    @JsonProperty("rel_humidity")
    private int relHumidity;

    @JsonProperty("fog")
    private int fog;

    @JsonProperty("wind_dir")
    private int windDir;

    @JsonProperty("wind_units")
    private int windUnits;

    @JsonProperty("wind_value")
    private int windValue;

    @JsonProperty("wind_units_name")
    private String windUnitsName;

    @JsonProperty("skies")
    private int skies;

    @JsonProperty("skies_name")
    private String skiesName;

    @JsonProperty("weather_var_initial")
    private int weatherVarInitial;

    @JsonProperty("weather_var_ongoing")
    private int weatherVarOngoing;

    @JsonProperty("simulated_time_multiplier")
    private int simulatedTimeMultiplier;

    // Getters and setters

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTempUnits() {
        return tempUnits;
    }

    public void setTempUnits(int tempUnits) {
        this.tempUnits = tempUnits;
    }

    public int getTempValue() {
        return tempValue;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    public String getTempUnitsName() {
        return tempUnitsName;
    }

    public void setTempUnitsName(String tempUnitsName) {
        this.tempUnitsName = tempUnitsName;
    }

    public int getRelHumidity() {
        return relHumidity;
    }

    public void setRelHumidity(int relHumidity) {
        this.relHumidity = relHumidity;
    }

    public int getFog() {
        return fog;
    }

    public void setFog(int fog) {
        this.fog = fog;
    }

    public int getWindDir() {
        return windDir;
    }

    public void setWindDir(int windDir) {
        this.windDir = windDir;
    }

    public int getWindUnits() {
        return windUnits;
    }

    public void setWindUnits(int windUnits) {
        this.windUnits = windUnits;
    }

    public int getWindValue() {
        return windValue;
    }

    public void setWindValue(int windValue) {
        this.windValue = windValue;
    }

    public String getWindUnitsName() {
        return windUnitsName;
    }

    public void setWindUnitsName(String windUnitsName) {
        this.windUnitsName = windUnitsName;
    }

    public int getSkies() {
        return skies;
    }

    public void setSkies(int skies) {
        this.skies = skies;
    }

    public String getSkiesName() {
        return skiesName;
    }

    public void setSkiesName(String skiesName) {
        this.skiesName = skiesName;
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

    public int getSimulatedTimeMultiplier() {
        return simulatedTimeMultiplier;
    }

    public void setSimulatedTimeMultiplier(int simulatedTimeMultiplier) {
        this.simulatedTimeMultiplier = simulatedTimeMultiplier;
    }
}
