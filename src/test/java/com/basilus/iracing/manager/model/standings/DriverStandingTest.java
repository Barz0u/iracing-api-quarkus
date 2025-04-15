package com.basilus.iracing.manager.model.standings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DriverStandingTest {
    @Test
    public void testDriverStandingFields() {
        // Create test data
        DriverStanding standing = new DriverStanding();
        WeekResult weekResult = new WeekResult();
        
        // Set all fields
        standing.setRank(1);
        standing.setCustId(12345);
        standing.setDisplayName("Test Driver");
        standing.setDivision(1);
        standing.setClubId(67890);
        standing.setClubName("Test Club");
        standing.setLicenseLevel(4);
        standing.setLicenseSubLevel(5);
        standing.setPoints(500);
        standing.setDroppedPoints(100);
        standing.setStarts(10);
        standing.setWins(2);
        standing.setTop5(5);
        standing.setTop25Percent(8);
        standing.setPoles(1);
        standing.setAvgStartPosition(10.5);
        standing.setAvgFinishPosition(5.5);
        standing.setAvgFieldSize(30.0);
        standing.setLaps(500);
        standing.setLapsLed(100);
        standing.setIncidents(5);
        standing.setWeekResults(List.of(weekResult));

        // Verify getters return correct values
        assertEquals(1, standing.getRank());
        assertEquals(12345, standing.getCustId());
        assertEquals("Test Driver", standing.getDisplayName());
        assertEquals(1, standing.getDivision());
        assertEquals(67890, standing.getClubId());
        assertEquals("Test Club", standing.getClubName());
        assertEquals(4, standing.getLicenseLevel());
        assertEquals(5, standing.getLicenseSubLevel());
        assertEquals(500, standing.getPoints());
        assertEquals(100, standing.getDroppedPoints());
        assertEquals(10, standing.getStarts());
        assertEquals(2, standing.getWins());
        assertEquals(5, standing.getTop5());
        assertEquals(8, standing.getTop25Percent());
        assertEquals(1, standing.getPoles());
        assertEquals(10.5, standing.getAvgStartPosition(), 0.01);
        assertEquals(5.5, standing.getAvgFinishPosition(), 0.01);
        assertEquals(30.0, standing.getAvgFieldSize(), 0.01);
        assertEquals(500, standing.getLaps());
        assertEquals(100, standing.getLapsLed());
        assertEquals(5, standing.getIncidents());
        assertEquals(List.of(weekResult), standing.getWeekResults());
    }

    @Test
    public void testNullValues() {
        DriverStanding standing = new DriverStanding();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, standing.getRank());
        assertEquals(0, standing.getCustId());
        assertNull(standing.getDisplayName());
        assertEquals(0, standing.getDivision());
        assertEquals(0, standing.getClubId());
        assertNull(standing.getClubName());
        assertEquals(0, standing.getLicenseLevel());
        assertEquals(0, standing.getLicenseSubLevel());
        assertEquals(0, standing.getPoints());
        assertEquals(0, standing.getDroppedPoints());
        assertEquals(0, standing.getStarts());
        assertEquals(0, standing.getWins());
        assertEquals(0, standing.getTop5());
        assertEquals(0, standing.getTop25Percent());
        assertEquals(0, standing.getPoles());
        assertNull(standing.getAvgStartPosition());
        assertNull(standing.getAvgFinishPosition());
        assertNull(standing.getAvgFieldSize());
        assertEquals(0, standing.getLaps());
        assertEquals(0, standing.getLapsLed());
        assertEquals(0, standing.getIncidents());
        assertNull(standing.getWeekResults());
    }
}
