package com.basilus.iracing.manager.model.standings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DriverStandingsResponseTest {
    @Test
    public void testDriverStandingsResponseFields() {
        // Create test data
        DriverStandingsResponse response = new DriverStandingsResponse();
        DriverStanding standing = new DriverStanding();
        
        // Set all fields
        response.setSeasonId(1);
        response.setSeasonName("Test Season");
        response.setSeasonShortName("TS");
        response.setCarClassId(2);
        response.setCarClassName("Test Class");
        response.setRaceWeekNum(1);
        response.setPointsSystemId(3);
        response.setPointsSystemName("Standard");
        response.setDrivers(List.of(standing));

        // Verify getters return correct values
        assertEquals(1, response.getSeasonId());
        assertEquals("Test Season", response.getSeasonName());
        assertEquals("TS", response.getSeasonShortName());
        assertEquals(2, response.getCarClassId());
        assertEquals("Test Class", response.getCarClassName());
        assertEquals(1, response.getRaceWeekNum());
        assertEquals(3, response.getPointsSystemId());
        assertEquals("Standard", response.getPointsSystemName());
        assertEquals(List.of(standing), response.getDrivers());
    }

    @Test
    public void testNullValues() {
        DriverStandingsResponse response = new DriverStandingsResponse();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, response.getSeasonId());
        assertNull(response.getSeasonName());
        assertNull(response.getSeasonShortName());
        assertEquals(0, response.getCarClassId());
        assertNull(response.getCarClassName());
        assertEquals(0, response.getRaceWeekNum());
        assertEquals(0, response.getPointsSystemId());
        assertNull(response.getPointsSystemName());
        assertNull(response.getDrivers());
    }
}
