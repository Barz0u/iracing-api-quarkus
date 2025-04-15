package com.basilus.iracing.manager.model.results;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {
    @Test
    public void testResultFields() {
        // Create test data
        Result result = new Result();
        ResultInterval interval = new ResultInterval();
        
        // Set all fields
        result.setCustId(12345);
        result.setDisplayName("Test Driver");
        result.setFinishPosition(1);
        result.setFinishPositionInClass(1);
        result.setLapsLead(5);
        result.setLapsComplete(20);
        result.setFastestLapTime(90);
        result.setAverageLapTime(95);
        result.setIncidents(0);
        result.setCarId(1);
        result.setCarName("Test Car");
        result.setCarClassId(2);
        result.setCarClassName("Test Class");
        result.setClubId(3);
        result.setClubName("Test Club");
        result.setDivision(1);
        result.setOldLicenseLevel(4);
        result.setOldLicenseSubLevel(5);
        result.setOldSafetyRating(3.5);
        result.setNewLicenseLevel(4);
        result.setNewLicenseSubLevel(6);
        result.setNewSafetyRating(3.6);
        result.setOldIrating(1500);
        result.setNewIrating(1550);
        result.setReasonOutId(0);
        result.setReasonOut("Finished");
        result.setInterval(interval);
        result.setChampionshipPoints(25);
        result.setTeamId(4);
        result.setTeamName("Test Team");
        result.setStartingPosition(1);
        result.setStartingPositionInClass(1);
        result.setCarNumber("1");

        // Verify getters return correct values
        assertEquals(12345, result.getCustId());
        assertEquals("Test Driver", result.getDisplayName());
        assertEquals(1, result.getFinishPosition());
        assertEquals(1, result.getFinishPositionInClass());
        assertEquals(5, result.getLapsLead());
        assertEquals(20, result.getLapsComplete());
        assertEquals(90, result.getFastestLapTime());
        assertEquals(95, result.getAverageLapTime());
        assertEquals(0, result.getIncidents());
        assertEquals(1, result.getCarId());
        assertEquals("Test Car", result.getCarName());
        assertEquals(2, result.getCarClassId());
        assertEquals("Test Class", result.getCarClassName());
        assertEquals(3, result.getClubId());
        assertEquals("Test Club", result.getClubName());
        assertEquals(1, result.getDivision());
        assertEquals(4, result.getOldLicenseLevel());
        assertEquals(5, result.getOldLicenseSubLevel());
        assertEquals(3.5, result.getOldSafetyRating(), 0.01);
        assertEquals(4, result.getNewLicenseLevel());
        assertEquals(6, result.getNewLicenseSubLevel());
        assertEquals(3.6, result.getNewSafetyRating(), 0.01);
        assertEquals(1500, result.getOldIrating());
        assertEquals(1550, result.getNewIrating());
        assertEquals(0, result.getReasonOutId());
        assertEquals("Finished", result.getReasonOut());
        assertEquals(interval, result.getInterval());
        assertEquals(25, result.getChampionshipPoints());
        assertEquals(4, result.getTeamId());
        assertEquals("Test Team", result.getTeamName());
        assertEquals(1, result.getStartingPosition());
        assertEquals(1, result.getStartingPositionInClass());
        assertEquals("1", result.getCarNumber());
    }

    @Test
    public void testNullValues() {
        Result result = new Result();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, result.getCustId());
        assertNull(result.getDisplayName());
        assertEquals(0, result.getFinishPosition());
        assertEquals(0, result.getFinishPositionInClass());
        assertEquals(0, result.getLapsLead());
        assertEquals(0, result.getLapsComplete());
        assertEquals(0, result.getFastestLapTime());
        assertEquals(0, result.getAverageLapTime());
        assertEquals(0, result.getIncidents());
        assertEquals(0, result.getCarId());
        assertNull(result.getCarName());
        assertEquals(0, result.getCarClassId());
        assertNull(result.getCarClassName());
        assertEquals(0, result.getClubId());
        assertNull(result.getClubName());
        assertEquals(0, result.getDivision());
        assertEquals(0, result.getOldLicenseLevel());
        assertEquals(0, result.getOldLicenseSubLevel());
        assertEquals(0.0, result.getOldSafetyRating(), 0.01);
        assertEquals(0, result.getNewLicenseLevel());
        assertEquals(0, result.getNewLicenseSubLevel());
        assertEquals(0.0, result.getNewSafetyRating(), 0.01);
        assertEquals(0, result.getOldIrating());
        assertEquals(0, result.getNewIrating());
        assertEquals(0, result.getReasonOutId());
        assertNull(result.getReasonOut());
        assertNull(result.getInterval());
        assertEquals(0, result.getChampionshipPoints());
        assertEquals(0, result.getTeamId());
        assertNull(result.getTeamName());
        assertEquals(0, result.getStartingPosition());
        assertEquals(0, result.getStartingPositionInClass());
        assertNull(result.getCarNumber());
    }
}
