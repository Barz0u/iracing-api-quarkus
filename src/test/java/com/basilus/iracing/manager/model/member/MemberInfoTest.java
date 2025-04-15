package com.basilus.iracing.manager.model.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberInfoTest {
    @Test
    public void testMemberInfoFields() {
        // Create test data
        MemberInfo memberInfo = new MemberInfo();
        MemberLicenses licenses = new MemberLicenses();
        
        // Set all fields
        memberInfo.setCustId(12345);
        memberInfo.setEmail("test@example.com");
        memberInfo.setUsername("testuser");
        memberInfo.setDisplayName("Test User");
        memberInfo.setFirstName("Test");
        memberInfo.setLastName("User");
        memberInfo.setOnCarName("TestCar");
        memberInfo.setMemberSince("2024-01-01");
        memberInfo.setLastLogin("2024-01-01T00:00:00Z");
        memberInfo.setClubId(67890);
        memberInfo.setClubName("Test Club");
        memberInfo.setLicenses(licenses);
        memberInfo.setAccountStatus("active");
        memberInfo.setHasReadTC(true);
        memberInfo.setAgreedToTC(true);
        memberInfo.setReadPP(true);
        memberInfo.setAgreedToPP(true);
        memberInfo.setAgreedToEula(true);
        memberInfo.setStatus("active");

        // Verify getters return correct values
        assertEquals(12345, memberInfo.getCustId());
        assertEquals("test@example.com", memberInfo.getEmail());
        assertEquals("testuser", memberInfo.getUsername());
        assertEquals("Test User", memberInfo.getDisplayName());
        assertEquals("Test", memberInfo.getFirstName());
        assertEquals("User", memberInfo.getLastName());
        assertEquals("TestCar", memberInfo.getOnCarName());
        assertEquals("2024-01-01", memberInfo.getMemberSince());
        assertEquals("2024-01-01T00:00:00Z", memberInfo.getLastLogin());
        assertEquals(67890, memberInfo.getClubId());
        assertEquals("Test Club", memberInfo.getClubName());
        assertEquals(licenses, memberInfo.getLicenses());
        assertEquals("active", memberInfo.getAccountStatus());
        assertTrue(memberInfo.isHasReadTC());
        assertTrue(memberInfo.isAgreedToTC());
        assertTrue(memberInfo.isReadPP());
        assertTrue(memberInfo.isAgreedToPP());
        assertTrue(memberInfo.isAgreedToEula());
        assertEquals("active", memberInfo.getStatus());
    }

    @Test
    public void testNullValues() {
        MemberInfo memberInfo = new MemberInfo();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, memberInfo.getCustId());
        assertNull(memberInfo.getEmail());
        assertNull(memberInfo.getUsername());
        assertNull(memberInfo.getDisplayName());
        assertNull(memberInfo.getFirstName());
        assertNull(memberInfo.getLastName());
        assertNull(memberInfo.getOnCarName());
        assertNull(memberInfo.getMemberSince());
        assertNull(memberInfo.getLastLogin());
        assertEquals(0, memberInfo.getClubId());
        assertNull(memberInfo.getClubName());
        assertNull(memberInfo.getLicenses());
        assertNull(memberInfo.getAccountStatus());
        assertFalse(memberInfo.isHasReadTC());
        assertFalse(memberInfo.isAgreedToTC());
        assertFalse(memberInfo.isReadPP());
        assertFalse(memberInfo.isAgreedToPP());
        assertFalse(memberInfo.isAgreedToEula());
        assertNull(memberInfo.getStatus());
    }
}
