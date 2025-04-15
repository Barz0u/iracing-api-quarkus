package com.basilus.iracing.manager.model.cars;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarInfoTest {
    @Test
    public void testCarInfoFields() {
        // Create test data
        CarInfo carInfo = new CarInfo();
        
        // Set all fields
        carInfo.setCarId(123);
        carInfo.setCarName("Test Car");
        carInfo.setCarNameAbbreviated("TC");
        carInfo.setCreated("2024-01-01");
        carInfo.setFreeWithSubscription(true);
        carInfo.setHasHeadlights(true);
        carInfo.setHasMultipleDryTireTypes(false);
        carInfo.setRetired(false);
        carInfo.setSku(456);
        carInfo.setAiEnabled(true);
        carInfo.setAllowNumberColors(true);
        carInfo.setAllowSponsorColors(false);
        carInfo.setAllowPaintColors(true);
        carInfo.setAwardExempt(false);
        carInfo.setCarDirPath("/cars/test");
        carInfo.setCarType("sports");
        carInfo.setCarWeight(1500);
        carInfo.setCategories(List.of("sports", "modern"));
        carInfo.setCreatedAt("2024-01-01T00:00:00Z");
        carInfo.setDamageModel(2);
        carInfo.setHp(600);
        carInfo.setMaxPowerAdjustPct(15);
        carInfo.setMaxWeightPenaltyKg(50);
        carInfo.setMinPowerAdjustPct(5);
        carInfo.setPackageId(789);
        carInfo.setPatterns(10);
        carInfo.setPrice(199.99);
        carInfo.setSearchFilters("sports modern");

        // Verify getters return correct values
        assertEquals(123, carInfo.getCarId());
        assertEquals("Test Car", carInfo.getCarName());
        assertEquals("TC", carInfo.getCarNameAbbreviated());
        assertEquals("2024-01-01", carInfo.getCreated());
        assertTrue(carInfo.isFreeWithSubscription());
        assertTrue(carInfo.isHasHeadlights());
        assertFalse(carInfo.isHasMultipleDryTireTypes());
        assertFalse(carInfo.isRetired());
        assertEquals(456, carInfo.getSku());
        assertTrue(carInfo.isAiEnabled());
        assertTrue(carInfo.isAllowNumberColors());
        assertFalse(carInfo.isAllowSponsorColors());
        assertTrue(carInfo.isAllowPaintColors());
        assertFalse(carInfo.isAwardExempt());
        assertEquals("/cars/test", carInfo.getCarDirPath());
        assertEquals("sports", carInfo.getCarType());
        assertEquals(1500, carInfo.getCarWeight());
        assertEquals(List.of("sports", "modern"), carInfo.getCategories());
        assertEquals("2024-01-01T00:00:00Z", carInfo.getCreatedAt());
        assertEquals(2, carInfo.getDamageModel());
        assertEquals(600, carInfo.getHp());
        assertEquals(15, carInfo.getMaxPowerAdjustPct());
        assertEquals(50, carInfo.getMaxWeightPenaltyKg());
        assertEquals(5, carInfo.getMinPowerAdjustPct());
        assertEquals(789, carInfo.getPackageId());
        assertEquals(10, carInfo.getPatterns());
        assertEquals(199.99, carInfo.getPrice(), 0.01);
        assertEquals("sports modern", carInfo.getSearchFilters());
    }

    @Test
    public void testNullValues() {
        CarInfo carInfo = new CarInfo();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, carInfo.getCarId());
        assertNull(carInfo.getCarName());
        assertNull(carInfo.getCarNameAbbreviated());
        assertNull(carInfo.getCreated());
        assertFalse(carInfo.isFreeWithSubscription());
        assertFalse(carInfo.isHasHeadlights());
        assertFalse(carInfo.isHasMultipleDryTireTypes());
        assertFalse(carInfo.isRetired());
        assertEquals(0, carInfo.getSku());
        assertFalse(carInfo.isAiEnabled());
        assertFalse(carInfo.isAllowNumberColors());
        assertFalse(carInfo.isAllowSponsorColors());
        assertFalse(carInfo.isAllowPaintColors());
        assertFalse(carInfo.isAwardExempt());
        assertNull(carInfo.getCarDirPath());
        assertNull(carInfo.getCarType());
        assertEquals(0, carInfo.getCarWeight());
        assertNull(carInfo.getCategories());
        assertNull(carInfo.getCreatedAt());
        assertEquals(0, carInfo.getDamageModel());
        assertEquals(0, carInfo.getHp());
        assertEquals(0, carInfo.getMaxPowerAdjustPct());
        assertEquals(0, carInfo.getMaxWeightPenaltyKg());
        assertEquals(0, carInfo.getMinPowerAdjustPct());
        assertEquals(0, carInfo.getPackageId());
        assertEquals(0, carInfo.getPatterns());
        assertEquals(0.0, carInfo.getPrice(), 0.01);
        assertNull(carInfo.getSearchFilters());
    }
}
