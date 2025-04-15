package com.basilus.iracing.manager.model.stats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the driver statistics response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverStatsResponse {

    @JsonProperty("cust_id")
    private int custId;

    @JsonProperty("stats")
    private List<CategoryStats> stats;

    // Getters and setters

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public List<CategoryStats> getStats() {
        return stats;
    }

    public void setStats(List<CategoryStats> stats) {
        this.stats = stats;
    }
}
