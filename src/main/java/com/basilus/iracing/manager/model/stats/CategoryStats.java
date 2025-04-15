package com.basilus.iracing.manager.model.stats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents statistics for a specific racing category from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryStats {

    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("category")
    private String category;

    @JsonProperty("starts")
    private int starts;

    @JsonProperty("wins")
    private int wins;

    @JsonProperty("top5")
    private int top5;

    @JsonProperty("poles")
    private int poles;

    @JsonProperty("avg_start_position")
    private double avgStartPosition;

    @JsonProperty("avg_finish_position")
    private double avgFinishPosition;

    @JsonProperty("laps")
    private int laps;

    @JsonProperty("laps_led")
    private int lapsLed;

    @JsonProperty("avg_incidents")
    private double avgIncidents;

    @JsonProperty("avg_points")
    private double avgPoints;

    @JsonProperty("win_percentage")
    private double winPercentage;

    @JsonProperty("top5_percentage")
    private double top5Percentage;

    @JsonProperty("laps_led_percentage")
    private double lapsLedPercentage;

    @JsonProperty("total_club_points")
    private int totalClubPoints;

    @JsonProperty("series_stats")
    private List<SeriesStats> seriesStats;

    // Getters and setters

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getTop5() {
        return top5;
    }

    public void setTop5(int top5) {
        this.top5 = top5;
    }

    public int getPoles() {
        return poles;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }

    public double getAvgStartPosition() {
        return avgStartPosition;
    }

    public void setAvgStartPosition(double avgStartPosition) {
        this.avgStartPosition = avgStartPosition;
    }

    public double getAvgFinishPosition() {
        return avgFinishPosition;
    }

    public void setAvgFinishPosition(double avgFinishPosition) {
        this.avgFinishPosition = avgFinishPosition;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public int getLapsLed() {
        return lapsLed;
    }

    public void setLapsLed(int lapsLed) {
        this.lapsLed = lapsLed;
    }

    public double getAvgIncidents() {
        return avgIncidents;
    }

    public void setAvgIncidents(double avgIncidents) {
        this.avgIncidents = avgIncidents;
    }

    public double getAvgPoints() {
        return avgPoints;
    }

    public void setAvgPoints(double avgPoints) {
        this.avgPoints = avgPoints;
    }

    public double getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(double winPercentage) {
        this.winPercentage = winPercentage;
    }

    public double getTop5Percentage() {
        return top5Percentage;
    }

    public void setTop5Percentage(double top5Percentage) {
        this.top5Percentage = top5Percentage;
    }

    public double getLapsLedPercentage() {
        return lapsLedPercentage;
    }

    public void setLapsLedPercentage(double lapsLedPercentage) {
        this.lapsLedPercentage = lapsLedPercentage;
    }

    public int getTotalClubPoints() {
        return totalClubPoints;
    }

    public void setTotalClubPoints(int totalClubPoints) {
        this.totalClubPoints = totalClubPoints;
    }

    public List<SeriesStats> getSeriesStats() {
        return seriesStats;
    }

    public void setSeriesStats(List<SeriesStats> seriesStats) {
        this.seriesStats = seriesStats;
    }
}
