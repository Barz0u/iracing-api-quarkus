package com.basilus.iracing.manager.model.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a car in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    @JsonProperty("car_id")
    private int carId;

    @JsonProperty("car_name")
    private String carName;

    @JsonProperty("car_class_id")
    private int carClassId;

    @JsonProperty("sku")
    private int sku;

    @JsonProperty("baseline_setup_created")
    private boolean baselineSetupCreated;

    @JsonProperty("retired")
    private boolean retired;

    @JsonProperty("package_id")
    private int packageId;

    @JsonProperty("free_with_subscription")
    private boolean freeWithSubscription;

    @JsonProperty("price")
    private double price;

    @JsonProperty("ai_enabled")
    private boolean aiEnabled;

    @JsonProperty("hp")
    private int hp;

    @JsonProperty("weight")
    private int weight;

    @JsonProperty("max_power_adjust_pct")
    private int maxPowerAdjustPct;

    @JsonProperty("max_weight_penalty_kg")
    private int maxWeightPenaltyKg;

    @JsonProperty("allow_number_colors")
    private boolean allowNumberColors;

    @JsonProperty("allow_sponsor_colors")
    private boolean allowSponsorColors;

    // Getters and setters

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarClassId() {
        return carClassId;
    }

    public void setCarClassId(int carClassId) {
        this.carClassId = carClassId;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public boolean isBaselineSetupCreated() {
        return baselineSetupCreated;
    }

    public void setBaselineSetupCreated(boolean baselineSetupCreated) {
        this.baselineSetupCreated = baselineSetupCreated;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public boolean isFreeWithSubscription() {
        return freeWithSubscription;
    }

    public void setFreeWithSubscription(boolean freeWithSubscription) {
        this.freeWithSubscription = freeWithSubscription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAiEnabled() {
        return aiEnabled;
    }

    public void setAiEnabled(boolean aiEnabled) {
        this.aiEnabled = aiEnabled;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxPowerAdjustPct() {
        return maxPowerAdjustPct;
    }

    public void setMaxPowerAdjustPct(int maxPowerAdjustPct) {
        this.maxPowerAdjustPct = maxPowerAdjustPct;
    }

    public int getMaxWeightPenaltyKg() {
        return maxWeightPenaltyKg;
    }

    public void setMaxWeightPenaltyKg(int maxWeightPenaltyKg) {
        this.maxWeightPenaltyKg = maxWeightPenaltyKg;
    }

    public boolean isAllowNumberColors() {
        return allowNumberColors;
    }

    public void setAllowNumberColors(boolean allowNumberColors) {
        this.allowNumberColors = allowNumberColors;
    }

    public boolean isAllowSponsorColors() {
        return allowSponsorColors;
    }

    public void setAllowSponsorColors(boolean allowSponsorColors) {
        this.allowSponsorColors = allowSponsorColors;
    }
}
