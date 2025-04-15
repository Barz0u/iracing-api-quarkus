package com.basilus.iracing.manager.model.seasons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackTest {
    @Test
    public void testTrackFields() {
        // Create test data
        Track track = new Track();
        
        // Set all fields
        track.setTrackId(123);
        track.setTrackName("Test Track");
        track.setConfigName("Main");
        track.setTrackConfigLength("4.0 km");
        track.setCategory("Oval");
        track.setCategoryId(1);
        track.setCornersPerLap(4);
        track.setTrackPrice(199.99);
        track.setTrackClimate("Temperate");
        track.setGridStalls(40);
        track.setHasOptPath(true);
        track.setLatitude(40.7128);
        track.setLongitude(-74.0060);
        track.setSearchFilters("oval modern");

        // Verify getters return correct values
        assertEquals(123, track.getTrackId());
        assertEquals("Test Track", track.getTrackName());
        assertEquals("Main", track.getConfigName());
        assertEquals("4.0 km", track.getTrackConfigLength());
        assertEquals("Oval", track.getCategory());
        assertEquals(1, track.getCategoryId());
        assertEquals(4, track.getCornersPerLap());
        assertEquals(199.99, track.getTrackPrice(), 0.01);
        assertEquals("Temperate", track.getTrackClimate());
        assertEquals(40, track.getGridStalls());
        assertTrue(track.isHasOptPath());
        assertEquals(40.7128, track.getLatitude(), 0.0001);
        assertEquals(-74.0060, track.getLongitude(), 0.0001);
        assertEquals("oval modern", track.getSearchFilters());
    }

    @Test
    public void testNullValues() {
        Track track = new Track();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, track.getTrackId());
        assertNull(track.getTrackName());
        assertNull(track.getConfigName());
        assertNull(track.getTrackConfigLength());
        assertNull(track.getCategory());
        assertEquals(0, track.getCategoryId());
        assertEquals(0, track.getCornersPerLap());
        assertEquals(0.0, track.getTrackPrice(), 0.01);
        assertNull(track.getTrackClimate());
        assertEquals(0, track.getGridStalls());
        assertFalse(track.isHasOptPath());
        assertEquals(0.0, track.getLatitude(), 0.0001);
        assertEquals(0.0, track.getLongitude(), 0.0001);
        assertNull(track.getSearchFilters());
    }
}
