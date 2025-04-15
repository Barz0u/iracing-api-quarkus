package com.basilus.iracing.manager.model.stats;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DriverStatsResponseTest {
    @Test
    public void testDriverStatsResponseFields() {
        // Create test data
        DriverStatsResponse response = new DriverStatsResponse();
        CategoryStats stats = new CategoryStats();
        
        // Set all fields
        response.setCustId(12345);
        response.setStats(List.of(stats));

        // Verify getters return correct values
        assertEquals(12345, response.getCustId());
        assertEquals(List.of(stats), response.getStats());
    }

    @Test
    public void testNullValues() {
        DriverStatsResponse response = new DriverStatsResponse();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, response.getCustId());
        assertNull(response.getStats());
    }
}
