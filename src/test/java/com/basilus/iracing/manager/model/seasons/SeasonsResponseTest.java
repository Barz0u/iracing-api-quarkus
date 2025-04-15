package com.basilus.iracing.manager.model.seasons;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeasonsResponseTest {
    @Test
    public void testSeasonsResponseFields() {
        // Create test data
        SeasonsResponse response = new SeasonsResponse();
        Season season = new Season();
        
        // Set all fields
        response.setSeasons(List.of(season));

        // Verify getters return correct values
        assertEquals(List.of(season), response.getSeasons());
    }

    @Test
    public void testNullValues() {
        SeasonsResponse response = new SeasonsResponse();
        
        // Verify default values are null or appropriate defaults
        assertNull(response.getSeasons());
    }
}
