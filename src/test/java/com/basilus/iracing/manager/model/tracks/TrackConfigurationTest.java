package com.basilus.iracing.manager.model.tracks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackConfigurationTest {
    @Test
    public void testTrackConfigurationFields() {
        // Create test data
        TrackConfiguration config = new TrackConfiguration();
        
        // Set all fields
        config.setTrackId(123);
        config.setTrackName("Test Track");
        config.setConfigName("Main");
        config.setCategoryId(1);
        config.setCategory("Oval");
        config.setCornersPerLap(4);
        config.setLengthKm(4.0);
        config.setHasOptPath(true);

        // Verify getters return correct values
        assertEquals(123, config.getTrackId());
        assertEquals("Test Track", config.getTrackName());
        assertEquals("Main", config.getConfigName());
        assertEquals(1, config.getCategoryId());
        assertEquals("Oval", config.getCategory());
        assertEquals(4, config.getCornersPerLap());
        assertEquals(4.0, config.getLengthKm(), 0.01);
        assertTrue(config.isHasOptPath());
    }

    @Test
    public void testNullValues() {
        TrackConfiguration config = new TrackConfiguration();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, config.getTrackId());
        assertNull(config.getTrackName());
        assertNull(config.getConfigName());
        assertEquals(0, config.getCategoryId());
        assertNull(config.getCategory());
        assertEquals(0, config.getCornersPerLap());
        assertEquals(0.0, config.getLengthKm(), 0.01);
        assertFalse(config.isHasOptPath());
    }
}
