package com.basilus.iracing.manager.model.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a driver's result for a specific race week from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeekResult {

    @JsonProperty("race_week_num")
    private int raceWeekNum;

    @JsonProperty("points")
    private int points;

    @JsonProperty("position")
    private int position;

    @JsonProperty("incidents")
    private int incidents;

    @JsonProperty("field_size")
    private int fieldSize;

    @JsonProperty("strength_of_field")
    private int strengthOfField;

    @JsonProperty("event_id")
    private long eventId;

    @JsonProperty("subsession_id")
    private long subsessionId;

    // Getters and setters

    public int getRaceWeekNum() {
        return raceWeekNum;
    }

    public void setRaceWeekNum(int raceWeekNum) {
        this.raceWeekNum = raceWeekNum;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getIncidents() {
        return incidents;
    }

    public void setIncidents(int incidents) {
        this.incidents = incidents;
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public int getStrengthOfField() {
        return strengthOfField;
    }

    public void setStrengthOfField(int strengthOfField) {
        this.strengthOfField = strengthOfField;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getSubsessionId() {
        return subsessionId;
    }

    public void setSubsessionId(long subsessionId) {
        this.subsessionId = subsessionId;
    }
}
