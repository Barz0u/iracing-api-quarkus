package com.basilus.iracing.manager.model.results;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the interval information in race results from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultInterval {

    @JsonProperty("lap_interval")
    private int lapInterval;

    @JsonProperty("time_interval")
    private int timeInterval;

    // Getters and setters

    public int getLapInterval() {
        return lapInterval;
    }

    public void setLapInterval(int lapInterval) {
        this.lapInterval = lapInterval;
    }

    public int getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(int timeInterval) {
        this.timeInterval = timeInterval;
    }
}
