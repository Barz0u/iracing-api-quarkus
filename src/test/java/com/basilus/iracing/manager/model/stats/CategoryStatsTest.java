package com.basilus.iracing.manager.model.stats;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryStatsTest {
    @Test
    public void testCategoryStatsFields() {
        // Create test data
        CategoryStats stats = new CategoryStats();
        SeriesStats seriesStats = new SeriesStats();
        
        // Set all fields
        stats.setCategoryId(1);
        stats.setCategory("Oval");
        stats.setStarts(100);
        stats.setWins(20);
        stats.setTop5(40);
        stats.setPoles(10);
        stats.setAvgStartPosition(12.5);
        stats.setAvgFinishPosition(8.5);
        stats.setLaps(2000);
        stats.setLapsLed(400);
        stats.setAvgIncidents(0.8);
        stats.setAvgPoints(60.0);
        stats.setWinPercentage(20.0);
        stats.setTop5Percentage(40.0);
        stats.setLapsLedPercentage(20.0);
        stats.setTotalClubPoints(200);
        stats.setSeriesStats(List.of(seriesStats));

        // Verify getters return correct values
        assertEquals(1, stats.getCategoryId());
        assertEquals("Oval", stats.getCategory());
        assertEquals(100, stats.getStarts());
        assertEquals(20, stats.getWins());
        assertEquals(40, stats.getTop5());
        assertEquals(10, stats.getPoles());
        assertEquals(12.5, stats.getAvgStartPosition(), 0.01);
        assertEquals(8.5, stats.getAvgFinishPosition(), 0.01);
        assertEquals(2000, stats.getLaps());
        assertEquals(400, stats.getLapsLed());
        assertEquals(0.8, stats.getAvgIncidents(), 0.01);
        assertEquals(60.0, stats.getAvgPoints(), 0.01);
        assertEquals(20.0, stats.getWinPercentage(), 0.01);
        assertEquals(40.0, stats.getTop5Percentage(), 0.01);
        assertEquals(20.0, stats.getLapsLedPercentage(), 0.01);
        assertEquals(200, stats.getTotalClubPoints());
        assertEquals(List.of(seriesStats), stats.getSeriesStats());
    }

    @Test
    public void testNullValues() {
        CategoryStats stats = new CategoryStats();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, stats.getCategoryId());
        assertNull(stats.getCategory());
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
        assertNull(stats.getSeriesStats());
    }
}
