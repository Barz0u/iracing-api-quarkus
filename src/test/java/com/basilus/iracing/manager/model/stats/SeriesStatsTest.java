package com.basilus.iracing.manager.model.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SeriesStatsTest {
    @Test
    public void testSeriesStatsFields() {
        // Create test data
        SeriesStats stats = new SeriesStats();
        
        // Set all fields
        stats.setSeriesId(123);
        stats.setSeriesName("Test Series");
        stats.setStarts(50);
        stats.setWins(10);
        stats.setTop5(25);
        stats.setPoles(5);
        stats.setAvgStartPosition(10.5);
        stats.setAvgFinishPosition(5.5);
        stats.setLaps(1000);
        stats.setLapsLed(200);
        stats.setAvgIncidents(0.5);
        stats.setAvgPoints(50.0);
        stats.setWinPercentage(20.0);
        stats.setTop5Percentage(50.0);
        stats.setLapsLedPercentage(20.0);
        stats.setTotalClubPoints(100);

        // Verify getters return correct values
        assertEquals(123, stats.getSeriesId());
        assertEquals("Test Series", stats.getSeriesName());
        assertEquals(50, stats.getStarts());
        assertEquals(10, stats.getWins());
        assertEquals(25, stats.getTop5());
        assertEquals(5, stats.getPoles());
        assertEquals(10.5, stats.getAvgStartPosition(), 0.01);
        assertEquals(5.5, stats.getAvgFinishPosition(), 0.01);
        assertEquals(1000, stats.getLaps());
        assertEquals(200, stats.getLapsLed());
        assertEquals(0.5, stats.getAvgIncidents(), 0.01);
        assertEquals(50.0, stats.getAvgPoints(), 0.01);
        assertEquals(20.0, stats.getWinPercentage(), 0.01);
        assertEquals(50.0, stats.getTop5Percentage(), 0.01);
        assertEquals(20.0, stats.getLapsLedPercentage(), 0.01);
        assertEquals(100, stats.getTotalClubPoints());
    }

    @Test
    public void testNullValues() {
        SeriesStats stats = new SeriesStats();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, stats.getSeriesId());
        assertNull(stats.getSeriesName());
        assertEquals(0, stats.getStarts());
        assertEquals(0, stats.getWins());
        assertEquals(0, stats.getTop5());
        assertEquals(0, stats.getPoles());
        assertEquals(0.0, stats.getAvgStartPosition(), 0.01);
        assertEquals(0.0, stats.getAvgFinishPosition(), 0.01);
        assertEquals(0, stats.getLaps());
        assertEquals(0, stats.getLapsLed());
        assertEquals(0.0, stats.getAvgIncidents(), 0.01);
        assertEquals(0.0, stats.getAvgPoints(), 0.01);
        assertEquals(0.0, stats.getWinPercentage(), 0.01);
        assertEquals(0.0, stats.getTop5Percentage(), 0.01);
        assertEquals(0.0, stats.getLapsLedPercentage(), 0.01);
        assertEquals(0, stats.getTotalClubPoints());
    }
}
