package com.basilus.iracing.manager.model.results;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a session within race results from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Session {

    @JsonProperty("session_id")
    private long sessionId;

    @JsonProperty("session_name")
    private String sessionName;

    @JsonProperty("session_type_id")
    private int sessionTypeId;

    @JsonProperty("session_type")
    private String sessionType;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("num_laps_for_qual_average")
    private int numLapsForQualAverage;

    @JsonProperty("num_laps_for_solo_average")
    private int numLapsForSoloAverage;

    @JsonProperty("results")
    private List<Result> results;

    // Getters and setters

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public int getSessionTypeId() {
        return sessionTypeId;
    }

    public void setSessionTypeId(int sessionTypeId) {
        this.sessionTypeId = sessionTypeId;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getNumLapsForQualAverage() {
        return numLapsForQualAverage;
    }

    public void setNumLapsForQualAverage(int numLapsForQualAverage) {
        this.numLapsForQualAverage = numLapsForQualAverage;
    }

    public int getNumLapsForSoloAverage() {
        return numLapsForSoloAverage;
    }

    public void setNumLapsForSoloAverage(int numLapsForSoloAverage) {
        this.numLapsForSoloAverage = numLapsForSoloAverage;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
