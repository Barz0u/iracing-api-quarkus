package com.basilus.iracing.manager.model.seasons;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarClassTest {
    @Test
    public void testCarClassFields() {
        // Create test data
        CarClass carClass = new CarClass();
        Car car = new Car();
        
        // Set all fields
        carClass.setCarClassId(1);
        carClass.setCarClassName("Test Class");
        carClass.setShortName("TC");
        carClass.setRelativeSpeed(100);
        carClass.setCars(List.of(car));

        // Verify getters return correct values
        assertEquals(1, carClass.getCarClassId());
        assertEquals("Test Class", carClass.getCarClassName());
        assertEquals("TC", carClass.getShortName());
        assertEquals(100, carClass.getRelativeSpeed());
        assertEquals(List.of(car), carClass.getCars());
    }

    @Test
    public void testNullValues() {
        CarClass carClass = new CarClass();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, carClass.getCarClassId());
        assertNull(carClass.getCarClassName());
        assertNull(carClass.getShortName());
        assertEquals(0, carClass.getRelativeSpeed());
        assertNull(carClass.getCars());
    }
}
