package com.basilus.iracing.manager.model.tracks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackMapLayerTest {
    @Test
    public void testTrackMapLayerFields() {
        // Create test data
        TrackMapLayer mapLayer = new TrackMapLayer();
        
        // Set all fields
        mapLayer.setLayerName("Main Track");
        mapLayer.setLayerOrder(1);
        mapLayer.setDisplayName("Main Track Layer");
        mapLayer.setOptional(false);
        mapLayer.setDefaultVisibility(true);

        // Verify getters return correct values
        assertEquals("Main Track", mapLayer.getLayerName());
        assertEquals(1, mapLayer.getLayerOrder());
        assertEquals("Main Track Layer", mapLayer.getDisplayName());
        assertFalse(mapLayer.isOptional());
        assertTrue(mapLayer.isDefaultVisibility());
    }

    @Test
    public void testNullValues() {
        TrackMapLayer mapLayer = new TrackMapLayer();
        
        // Verify default values are null or appropriate defaults
        assertNull(mapLayer.getLayerName());
        assertEquals(0, mapLayer.getLayerOrder());
        assertNull(mapLayer.getDisplayName());
        assertFalse(mapLayer.isOptional());
        assertFalse(mapLayer.isDefaultVisibility());
    }
}
