package com.basilus.iracing.manager.model.standings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeekResultTest {
    @Test
    public void testWeekResultFields() {
        // Create test data
        WeekResult result = new WeekResult();
        
        // Set all fields
        result.setRaceWeekNum(1);
        result.setPoints(50);
        result.setPosition(2);
        result.setIncidents(0);
        result.setFieldSize(30);
        result.setStrengthOfField(1500);
        result.setEventId(123456789L);
        result.setSubsessionId(987654321L);

        // Verify getters return correct values
        assertEquals(1, result.getRaceWeekNum());
        assertEquals(50, result.getPoints());
        assertEquals(2, result.getPosition());
        assertEquals(0, result.getIncidents());
        assertEquals(30, result.getFieldSize());
        assertEquals(1500, result.getStrengthOfField());
        assertEquals(123456789L, result.getEventId());
        assertEquals(987654321L, result.getSubsessionId());
    }

    @Test
    public void testNullValues() {
        WeekResult result = new WeekResult();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, result.getRaceWeekNum());
        assertEquals(0, result.getPoints());
        assertEquals(0, result.getPosition());
        assertEquals(0, result.getIncidents());
        assertEquals(0, result.getFieldSize());
        assertEquals(0, result.getStrengthOfField());
        assertEquals(0L, result.getEventId());
        assertEquals(0L, result.getSubsessionId());
    }
}
