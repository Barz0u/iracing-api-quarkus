package com.basilus.iracing.manager.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CacheLinkResponseTest {
    @Test
    public void testCacheLinkResponseFields() {
        // Create test data
        CacheLinkResponse response = new CacheLinkResponse();
        String testLink = "https://example.com/cache/data.json";
        String testExpires = "2024-01-01T00:00:00Z";

        // Set fields
        response.setLink(testLink);
        response.setExpires(testExpires);

        // Verify getters return correct values
        assertEquals(testLink, response.getLink());
        assertEquals(testExpires, response.getExpires());
    }

    @Test
    public void testNullValues() {
        CacheLinkResponse response = new CacheLinkResponse();
        
        // Verify default values are null
        assertNull(response.getLink());
        assertNull(response.getExpires());
    }
}
