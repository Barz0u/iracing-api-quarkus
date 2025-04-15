package com.basilus.iracing.manager.model.tracks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrackInfoTest {
    @Test
    public void testTrackInfoFields() {
        // Create test data
        TrackInfo trackInfo = new TrackInfo();
        TrackMapLayer mapLayer = new TrackMapLayer();
        TrackConfiguration config = new TrackConfiguration();
        
        // Set all fields
        trackInfo.setTrackId(123);
        trackInfo.setTrackName("Test Track");
        trackInfo.setTrackNameFull("Test Track Full Name");
        trackInfo.setConfigName("Main");
        trackInfo.setTrackNameWithConfig("Test Track - Main");
        trackInfo.setCategory("Oval");
        trackInfo.setCategoryId(1);
        trackInfo.setHasLocalMapping(true);
        trackInfo.setHasDynamicWeather(true);
        trackInfo.setHasDynamicTime(true);
        trackInfo.setHasRaceBeacon(true);
        trackInfo.setHasPaceCar(true);
        trackInfo.setHasRaceControl(true);
        trackInfo.setLocation("Test Location");
        trackInfo.setLatitude(40.7128);
        trackInfo.setLongitude(-74.0060);
        trackInfo.setTrackMapLayers(List.of(mapLayer));
        trackInfo.setConfigurations(List.of(config));
        trackInfo.setTimeZones(List.of("America/New_York", "UTC"));
        trackInfo.setPrice(199.99);
        trackInfo.setFree(false);
        trackInfo.setLegacy(false);
        trackInfo.setDirt(false);
        trackInfo.setOval(true);
        trackInfo.setEmpty(false);
        trackInfo.setLengthKm(4.0);
        trackInfo.setCornersPerLap(4);
        trackInfo.setPitroadSpeedLimitKph(80);
        trackInfo.setHasOptPath(true);

        // Verify getters return correct values
        assertEquals(123, trackInfo.getTrackId());
        assertEquals("Test Track", trackInfo.getTrackName());
        assertEquals("Test Track Full Name", trackInfo.getTrackNameFull());
        assertEquals("Main", trackInfo.getConfigName());
        assertEquals("Test Track - Main", trackInfo.getTrackNameWithConfig());
        assertEquals("Oval", trackInfo.getCategory());
        assertEquals(1, trackInfo.getCategoryId());
        assertTrue(trackInfo.isHasLocalMapping());
        assertTrue(trackInfo.isHasDynamicWeather());
        assertTrue(trackInfo.isHasDynamicTime());
        assertTrue(trackInfo.isHasRaceBeacon());
        assertTrue(trackInfo.isHasPaceCar());
        assertTrue(trackInfo.isHasRaceControl());
        assertEquals("Test Location", trackInfo.getLocation());
        assertEquals(40.7128, trackInfo.getLatitude(), 0.0001);
        assertEquals(-74.0060, trackInfo.getLongitude(), 0.0001);
        assertEquals(List.of(mapLayer), trackInfo.getTrackMapLayers());
        assertEquals(List.of(config), trackInfo.getConfigurations());
        assertEquals(List.of("America/New_York", "UTC"), trackInfo.getTimeZones());
        assertEquals(199.99, trackInfo.getPrice(), 0.01);
        assertFalse(trackInfo.isFree());
        assertFalse(trackInfo.isLegacy());
        assertFalse(trackInfo.isDirt());
        assertTrue(trackInfo.isOval());
        assertFalse(trackInfo.isEmpty());
        assertEquals(4.0, trackInfo.getLengthKm(), 0.01);
        assertEquals(4, trackInfo.getCornersPerLap());
        assertEquals(80, trackInfo.getPitroadSpeedLimitKph());
        assertTrue(trackInfo.isHasOptPath());
    }

    @Test
    public void testNullValues() {
        TrackInfo trackInfo = new TrackInfo();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, trackInfo.getTrackId());
        assertNull(trackInfo.getTrackName());
        assertNull(trackInfo.getTrackNameFull());
        assertNull(trackInfo.getConfigName());
        assertNull(trackInfo.getTrackNameWithConfig());
        assertNull(trackInfo.getCategory());
        assertEquals(0, trackInfo.getCategoryId());
        assertFalse(trackInfo.isHasLocalMapping());
        assertFalse(trackInfo.isHasDynamicWeather());
        assertFalse(trackInfo.isHasDynamicTime());
        assertFalse(trackInfo.isHasRaceBeacon());
        assertFalse(trackInfo.isHasPaceCar());
        assertFalse(trackInfo.isHasRaceControl());
        assertNull(trackInfo.getLocation());
        assertEquals(0.0, trackInfo.getLatitude(), 0.01);
        assertEquals(0.0, trackInfo.getLongitude(), 0.01);
        assertNull(trackInfo.getTrackMapLayers());
        assertNull(trackInfo.getConfigurations());
        assertNull(trackInfo.getTimeZones());
        assertEquals(0.0, trackInfo.getPrice(), 0.01);
        assertFalse(trackInfo.isFree());
        assertFalse(trackInfo.isLegacy());
        assertFalse(trackInfo.isDirt());
        assertFalse(trackInfo.isOval());
        assertFalse(trackInfo.isEmpty());
        assertEquals(0.0, trackInfo.getLengthKm(), 0.01);
        assertEquals(0, trackInfo.getCornersPerLap());
        assertEquals(0, trackInfo.getPitroadSpeedLimitKph());
        assertFalse(trackInfo.isHasOptPath());
    }
}
