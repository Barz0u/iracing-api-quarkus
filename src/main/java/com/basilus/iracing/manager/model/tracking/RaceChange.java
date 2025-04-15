package com.basilus.iracing.manager.model.tracking;

import java.time.LocalDateTime;

/**
 * Represents a detected change in a member's race statistics.
 */
public class RaceChange {
    private int custId;
    private String displayName;
    private int categoryId;
    private String categoryName;
    private int previousStarts;
    private int currentStarts;
    private int previousWins;
    private int currentWins;
    private int previousTop5;
    private int currentTop5;
    private LocalDateTime detectedAt;

    public RaceChange(int custId, String displayName, int categoryId, String categoryName,
                      int previousStarts, int currentStarts,
                      int previousWins, int currentWins,
                      int previousTop5, int currentTop5) {
        this.custId = custId;
        this.displayName = displayName;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.previousStarts = previousStarts;
        this.currentStarts = currentStarts;
        this.previousWins = previousWins;
        this.currentWins = currentWins;
        this.previousTop5 = previousTop5;
        this.currentTop5 = currentTop5;
        this.detectedAt = LocalDateTime.now();
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPreviousStarts() {
        return previousStarts;
    }

    public void setPreviousStarts(int previousStarts) {
        this.previousStarts = previousStarts;
    }

    public int getCurrentStarts() {
        return currentStarts;
    }

    public void setCurrentStarts(int currentStarts) {
        this.currentStarts = currentStarts;
    }

    public int getPreviousWins() {
        return previousWins;
    }

    public void setPreviousWins(int previousWins) {
        this.previousWins = previousWins;
    }

    public int getCurrentWins() {
        return currentWins;
    }

    public void setCurrentWins(int currentWins) {
        this.currentWins = currentWins;
    }

    public int getPreviousTop5() {
        return previousTop5;
    }

    public void setPreviousTop5(int previousTop5) {
        this.previousTop5 = previousTop5;
    }

    public int getCurrentTop5() {
        return currentTop5;
    }

    public void setCurrentTop5(int currentTop5) {
        this.currentTop5 = currentTop5;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }

    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }

    public boolean hasNewRaces() {
        return currentStarts > previousStarts;
    }

    public boolean hasNewWins() {
        return currentWins > previousWins;
    }

    public boolean hasNewTop5() {
        return currentTop5 > previousTop5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Race change detected for ").append(displayName).append(" (").append(custId).append(") in ").append(categoryName).append(":\n");

        if (hasNewRaces()) {
            int newRaces = currentStarts - previousStarts;
            sb.append("- ").append(newRaces).append(" new race").append(newRaces > 1 ? "s" : "").append(" completed\n");
        }

        if (hasNewWins()) {
            int newWins = currentWins - previousWins;
            sb.append("- ").append(newWins).append(" new win").append(newWins > 1 ? "s" : "").append("\n");
        }

        if (hasNewTop5()) {
            int newTop5 = currentTop5 - previousTop5;
            sb.append("- ").append(newTop5).append(" new top 5 finish").append(newTop5 > 1 ? "es" : "");
        }

        return sb.toString();
    }
}
