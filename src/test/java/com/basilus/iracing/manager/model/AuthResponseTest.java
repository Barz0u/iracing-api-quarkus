package com.basilus.iracing.manager.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseTest {
    @Test
    public void testAuthResponseFields() {
        // Create test data
        AuthResponse authResponse = new AuthResponse();
        String testAuthCode = "test-auth-code";
        String testAutoLoginSeries = "test-series";
        String testAutoLoginToken = "test-token";
        Integer testCustId = 12345;
        String testEmail = "test@example.com";
        String testCookieDomain = ".iracing.com";
        String testCookieName = "sso";
        String testCookiePath = "/";
        String testCookieValue = "test-cookie-value";

        // Set fields
        authResponse.setAuthcode(testAuthCode);
        authResponse.setAutoLoginSeries(testAutoLoginSeries);
        authResponse.setAutoLoginToken(testAutoLoginToken);
        authResponse.setCustId(testCustId);
        authResponse.setEmail(testEmail);
        authResponse.setSsoCookieDomain(testCookieDomain);
        authResponse.setSsoCookieName(testCookieName);
        authResponse.setSsoCookiePath(testCookiePath);
        authResponse.setSsoCookieValue(testCookieValue);

        // Verify getters return correct values
        assertEquals(testAuthCode, authResponse.getAuthcode());
        assertEquals(testAutoLoginSeries, authResponse.getAutoLoginSeries());
        assertEquals(testAutoLoginToken, authResponse.getAutoLoginToken());
        assertEquals(testCustId, authResponse.getCustId());
        assertEquals(testEmail, authResponse.getEmail());
        assertEquals(testCookieDomain, authResponse.getSsoCookieDomain());
        assertEquals(testCookieName, authResponse.getSsoCookieName());
        assertEquals(testCookiePath, authResponse.getSsoCookiePath());
        assertEquals(testCookieValue, authResponse.getSsoCookieValue());
    }

    @Test
    public void testNullValues() {
        AuthResponse authResponse = new AuthResponse();
        
        // Verify default values are null
        assertNull(authResponse.getAuthcode());
        assertNull(authResponse.getAutoLoginSeries());
        assertNull(authResponse.getAutoLoginToken());
        assertNull(authResponse.getEmail());
        assertNull(authResponse.getSsoCookieDomain());
        assertNull(authResponse.getSsoCookieName());
        assertNull(authResponse.getSsoCookiePath());
        assertNull(authResponse.getSsoCookieValue());
        
        // Verify custId defaults to null
        assertNull(authResponse.getCustId());
    }
}
