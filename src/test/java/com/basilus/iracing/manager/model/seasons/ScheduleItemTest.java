package com.basilus.iracing.manager.model.seasons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScheduleItemTest {
    @Test
    public void testScheduleItemFields() {
        // Create test data
        ScheduleItem item = new ScheduleItem();
        Track track = new Track();
        
        // Set all fields
        item.setRaceWeekNum(1);
        item.setTrack(track);
        item.setTrackName("Test Track");
        item.setTrackId(123);
        item.setTimeLimit(90);
        item.setStartDate("2024-01-01T18:00:00Z");
        item.setEndDate("2024-01-01T21:00:00Z");
        item.setSimulatedTimeMultiplier(1.0);
        item.setWeatherType("Sunny");
        item.setWeatherVarInitial(5);
        item.setWeatherVarOngoing(3);
        item.setTrackStateInitial(100);
        item.setTrackStateQualifying(100);
        item.setTrackStateRace(100);

        // Verify getters return correct values
        assertEquals(1, item.getRaceWeekNum());
        assertEquals(track, item.getTrack());
        assertEquals("Test Track", item.getTrackName());
        assertEquals(123, item.getTrackId());
        assertEquals(90, item.getTimeLimit());
        assertEquals("2024-01-01T18:00:00Z", item.getStartDate());
        assertEquals("2024-01-01T21:00:00Z", item.getEndDate());
        assertEquals(1.0, item.getSimulatedTimeMultiplier(), 0.01);
        assertEquals("Sunny", item.getWeatherType());
        assertEquals(5, item.getWeatherVarInitial());
        assertEquals(3, item.getWeatherVarOngoing());
        assertEquals(100, item.getTrackStateInitial());
        assertEquals(100, item.getTrackStateQualifying());
        assertEquals(100, item.getTrackStateRace());
    }

    @Test
    public void testNullValues() {
        ScheduleItem item = new ScheduleItem();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, item.getRaceWeekNum());
        assertNull(item.getTrack());
        assertNull(item.getTrackName());
        assertEquals(0, item.getTrackId());
        assertEquals(0, item.getTimeLimit());
        assertNull(item.getStartDate());
        assertNull(item.getEndDate());
        assertEquals(0.0, item.getSimulatedTimeMultiplier(), 0.01);
        assertNull(item.getWeatherType());
        assertEquals(0, item.getWeatherVarInitial());
        assertEquals(0, item.getWeatherVarOngoing());
        assertEquals(0, item.getTrackStateInitial());
        assertEquals(0, item.getTrackStateQualifying());
        assertEquals(0, item.getTrackStateRace());
    }
}
