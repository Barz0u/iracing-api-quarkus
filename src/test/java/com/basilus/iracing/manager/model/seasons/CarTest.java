package com.basilus.iracing.manager.model.seasons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testCarFields() {
        // Create test data
        Car car = new Car();
        
        // Set all fields
        car.setCarId(123);
        car.setCarName("Test Car");
        car.setCarClassId(1);
        car.setSku(456);
        car.setBaselineSetupCreated(true);
        car.setRetired(false);
        car.setPackageId(789);
        car.setFreeWithSubscription(true);
        car.setPrice(199.99);
        car.setAiEnabled(true);
        car.setHp(600);
        car.setWeight(1500);
        car.setMaxPowerAdjustPct(15);
        car.setMaxWeightPenaltyKg(50);
        car.setAllowNumberColors(true);
        car.setAllowSponsorColors(true);

        // Verify getters return correct values
        assertEquals(123, car.getCarId());
        assertEquals("Test Car", car.getCarName());
        assertEquals(1, car.getCarClassId());
        assertEquals(456, car.getSku());
        assertTrue(car.isBaselineSetupCreated());
        assertFalse(car.isRetired());
        assertEquals(789, car.getPackageId());
        assertTrue(car.isFreeWithSubscription());
        assertEquals(199.99, car.getPrice(), 0.01);
        assertTrue(car.isAiEnabled());
        assertEquals(600, car.getHp());
        assertEquals(1500, car.getWeight());
        assertEquals(15, car.getMaxPowerAdjustPct());
        assertEquals(50, car.getMaxWeightPenaltyKg());
        assertTrue(car.isAllowNumberColors());
        assertTrue(car.isAllowSponsorColors());
    }

    @Test
    public void testNullValues() {
        Car car = new Car();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, car.getCarId());
        assertNull(car.getCarName());
        assertEquals(0, car.getCarClassId());
        assertEquals(0, car.getSku());
        assertFalse(car.isBaselineSetupCreated());
        assertFalse(car.isRetired());
        assertEquals(0, car.getPackageId());
        assertFalse(car.isFreeWithSubscription());
        assertEquals(0.0, car.getPrice(), 0.01);
        assertFalse(car.isAiEnabled());
        assertEquals(0, car.getHp());
        assertEquals(0, car.getWeight());
        assertEquals(0, car.getMaxPowerAdjustPct());
        assertEquals(0, car.getMaxWeightPenaltyKg());
        assertFalse(car.isAllowNumberColors());
        assertFalse(car.isAllowSponsorColors());
    }
}
