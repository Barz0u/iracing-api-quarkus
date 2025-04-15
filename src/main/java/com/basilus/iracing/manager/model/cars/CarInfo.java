package com.basilus.iracing.manager.model.cars;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents detailed car information in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarInfo {

    @JsonProperty("car_id")
    private int carId;

    @JsonProperty("car_name")
    private String carName;

    @JsonProperty("car_name_abbreviated")
    private String carNameAbbreviated;

    @JsonProperty("created")
    private String created;

    @JsonProperty("free_with_subscription")
    private boolean freeWithSubscription;

    @JsonProperty("has_headlights")
    private boolean hasHeadlights;

    @JsonProperty("has_multiple_dry_tire_types")
    private boolean hasMultipleDryTireTypes;

    @JsonProperty("retired")
    private boolean retired;

    @JsonProperty("sku")
    private int sku;

    @JsonProperty("ai_enabled")
    private boolean aiEnabled;

    @JsonProperty("allow_number_colors")
    private boolean allowNumberColors;

    @JsonProperty("allow_sponsor_colors")
    private boolean allowSponsorColors;

    @JsonProperty("allow_paint_colors")
    private boolean allowPaintColors;

    @JsonProperty("award_exempt")
    private boolean awardExempt;

    @JsonProperty("car_dirpath")
    private String carDirPath;

    @JsonProperty("car_type")
    private String carType;

    @JsonProperty("car_weight")
    private int carWeight;

    @JsonProperty("categories")
    private List<String> categories;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("damage_model")
    private int damageModel;

    @JsonProperty("hp")
    private int hp;

    @JsonProperty("max_power_adjust_pct")
    private int maxPowerAdjustPct;

    @JsonProperty("max_weight_penalty_kg")
    private int maxWeightPenaltyKg;

    @JsonProperty("min_power_adjust_pct")
    private int minPowerAdjustPct;

    @JsonProperty("package_id")
    private int packageId;

    @JsonProperty("patterns")
    private int patterns;

    @JsonProperty("price")
    private double price;

    @JsonProperty("search_filters")
    private String searchFilters;

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

    public String getCarNameAbbreviated() {
        return carNameAbbreviated;
    }

    public void setCarNameAbbreviated(String carNameAbbreviated) {
        this.carNameAbbreviated = carNameAbbreviated;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public boolean isFreeWithSubscription() {
        return freeWithSubscription;
    }

    public void setFreeWithSubscription(boolean freeWithSubscription) {
        this.freeWithSubscription = freeWithSubscription;
    }

    public boolean isHasHeadlights() {
        return hasHeadlights;
    }

    public void setHasHeadlights(boolean hasHeadlights) {
        this.hasHeadlights = hasHeadlights;
    }

    public boolean isHasMultipleDryTireTypes() {
        return hasMultipleDryTireTypes;
    }

    public void setHasMultipleDryTireTypes(boolean hasMultipleDryTireTypes) {
        this.hasMultipleDryTireTypes = hasMultipleDryTireTypes;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public boolean isAiEnabled() {
        return aiEnabled;
    }

    public void setAiEnabled(boolean aiEnabled) {
        this.aiEnabled = aiEnabled;
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

    public boolean isAllowPaintColors() {
        return allowPaintColors;
    }

    public void setAllowPaintColors(boolean allowPaintColors) {
        this.allowPaintColors = allowPaintColors;
    }

    public boolean isAwardExempt() {
        return awardExempt;
    }

    public void setAwardExempt(boolean awardExempt) {
        this.awardExempt = awardExempt;
    }

    public String getCarDirPath() {
        return carDirPath;
    }

    public void setCarDirPath(String carDirPath) {
        this.carDirPath = carDirPath;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getDamageModel() {
        return damageModel;
    }

    public void setDamageModel(int damageModel) {
        this.damageModel = damageModel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public int getMinPowerAdjustPct() {
        return minPowerAdjustPct;
    }

    public void setMinPowerAdjustPct(int minPowerAdjustPct) {
        this.minPowerAdjustPct = minPowerAdjustPct;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getPatterns() {
        return patterns;
    }

    public void setPatterns(int patterns) {
        this.patterns = patterns;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSearchFilters() {
        return searchFilters;
    }

    public void setSearchFilters(String searchFilters) {
        this.searchFilters = searchFilters;
    }
}
