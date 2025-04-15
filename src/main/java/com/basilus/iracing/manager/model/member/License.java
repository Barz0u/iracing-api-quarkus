package com.basilus.iracing.manager.model.member;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a license in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class License {

    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("category")
    private String category;

    @JsonProperty("license_level")
    private int licenseLevel;

    @JsonProperty("license_class")
    private String licenseClass;

    @JsonProperty("safety_rating")
    private double safetyRating;

    @JsonProperty("cpi")
    private double cpi;

    @JsonProperty("irating")
    private int irating;

    @JsonProperty("tt_rating")
    private int ttRating;

    @JsonProperty("mpr_num_races")
    private int mprNumRaces;

    @JsonProperty("group_id")
    private int groupId;

    @JsonProperty("group_name")
    private String groupName;

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

    public int getLicenseLevel() {
        return licenseLevel;
    }

    public void setLicenseLevel(int licenseLevel) {
        this.licenseLevel = licenseLevel;
    }

    public String getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(String licenseClass) {
        this.licenseClass = licenseClass;
    }

    public double getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(double safetyRating) {
        this.safetyRating = safetyRating;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    public int getIrating() {
        return irating;
    }

    public void setIrating(int irating) {
        this.irating = irating;
    }

    public int getTtRating() {
        return ttRating;
    }

    public void setTtRating(int ttRating) {
        this.ttRating = ttRating;
    }

    public int getMprNumRaces() {
        return mprNumRaces;
    }

    public void setMprNumRaces(int mprNumRaces) {
        this.mprNumRaces = mprNumRaces;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
