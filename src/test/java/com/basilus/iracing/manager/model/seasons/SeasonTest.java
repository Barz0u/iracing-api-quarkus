package com.basilus.iracing.manager.model.seasons;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeasonTest {
    @Test
    public void testSeasonFields() {
        // Create test data
        Season season = new Season();
        ScheduleItem scheduleItem = new ScheduleItem();
        CarClass carClass = new CarClass();
        
        // Set all fields
        season.setSeasonId(123);
        season.setSeasonName("Test Season");
        season.setSeasonShortName("TS");
        season.setSeasonYear(2024);
        season.setSeasonQuarter(1);
        season.setActive(true);
        season.setLicenseGroup("Oval");
        season.setLicenseGroupId(1);
        season.setRaceWeekCount(10);
        season.setTrackTypes(List.of("Oval", "Road"));
        season.setStartDate("2024-01-01");
        season.setEndDate("2024-03-31");
        season.setSeasonSchedule(List.of(scheduleItem));
        season.setCarClasses(List.of(carClass));
        season.setCarsInSeasonCount(20);
        season.setMinLicenseLevel(4);
        season.setSeriesId(456);

        // Verify getters return correct values
        assertEquals(123, season.getSeasonId());
        assertEquals("Test Season", season.getSeasonName());
        assertEquals("TS", season.getSeasonShortName());
        assertEquals(2024, season.getSeasonYear());
        assertEquals(1, season.getSeasonQuarter());
        assertTrue(season.isActive());
        assertEquals("Oval", season.getLicenseGroup());
        assertEquals(1, season.getLicenseGroupId());
        assertEquals(10, season.getRaceWeekCount());
        assertEquals(List.of("Oval", "Road"), season.getTrackTypes());
        assertEquals("2024-01-01", season.getStartDate());
        assertEquals("2024-03-31", season.getEndDate());
        assertEquals(List.of(scheduleItem), season.getSeasonSchedule());
        assertEquals(List.of(carClass), season.getCarClasses());
        assertEquals(20, season.getCarsInSeasonCount());
        assertEquals(4, season.getMinLicenseLevel());
        assertEquals(456, season.getSeriesId());
    }

    @Test
    public void testNullValues() {
        Season season = new Season();
        
        // Verify default values are null or appropriate defaults
        assertEquals(0, season.getSeasonId());
        assertNull(season.getSeasonName());
        assertNull(season.getSeasonShortName());
        assertEquals(0, season.getSeasonYear());
        assertEquals(0, season.getSeasonQuarter());
        assertFalse(season.isActive());
        assertNull(season.getLicenseGroup());
        assertEquals(0, season.getLicenseGroupId());
        assertEquals(0, season.getRaceWeekCount());
        assertNull(season.getTrackTypes());
        assertNull(season.getStartDate());
        assertNull(season.getEndDate());
        assertNull(season.getSeasonSchedule());
        assertNull(season.getCarClasses());
        assertEquals(0, season.getCarsInSeasonCount());
        assertEquals(0, season.getMinLicenseLevel());
        assertEquals(0, season.getSeriesId());
    }
}
