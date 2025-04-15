package com.basilus.iracing.manager.model.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents minimum requirements for a league from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueRequirements {

    @JsonProperty("min_oval_sr")
    private Integer minOvalSr;

    @JsonProperty("min_oval_license_level")
    private Integer minOvalLicenseLevel;

    @JsonProperty("min_road_sr")
    private Integer minRoadSr;

    @JsonProperty("min_road_license_level")
    private Integer minRoadLicenseLevel;

    @JsonProperty("min_dirt_oval_sr")
    private Integer minDirtOvalSr;

    @JsonProperty("min_dirt_oval_license_level")
    private Integer minDirtOvalLicenseLevel;

    @JsonProperty("min_dirt_road_sr")
    private Integer minDirtRoadSr;

    @JsonProperty("min_dirt_road_license_level")
    private Integer minDirtRoadLicenseLevel;

    @JsonProperty("min_irating")
    private Integer minIrating;

    // Getters and setters

    public Integer getMinOvalSr() {
        return minOvalSr;
    }

    public void setMinOvalSr(Integer minOvalSr) {
        this.minOvalSr = minOvalSr;
    }

    public Integer getMinOvalLicenseLevel() {
        return minOvalLicenseLevel;
    }

    public void setMinOvalLicenseLevel(Integer minOvalLicenseLevel) {
        this.minOvalLicenseLevel = minOvalLicenseLevel;
    }

    public Integer getMinRoadSr() {
        return minRoadSr;
    }

    public void setMinRoadSr(Integer minRoadSr) {
        this.minRoadSr = minRoadSr;
    }

    public Integer getMinRoadLicenseLevel() {
        return minRoadLicenseLevel;
    }

    public void setMinRoadLicenseLevel(Integer minRoadLicenseLevel) {
        this.minRoadLicenseLevel = minRoadLicenseLevel;
    }

    public Integer getMinDirtOvalSr() {
        return minDirtOvalSr;
    }

    public void setMinDirtOvalSr(Integer minDirtOvalSr) {
        this.minDirtOvalSr = minDirtOvalSr;
    }

    public Integer getMinDirtOvalLicenseLevel() {
        return minDirtOvalLicenseLevel;
    }

    public void setMinDirtOvalLicenseLevel(Integer minDirtOvalLicenseLevel) {
        this.minDirtOvalLicenseLevel = minDirtOvalLicenseLevel;
    }

    public Integer getMinDirtRoadSr() {
        return minDirtRoadSr;
    }

    public void setMinDirtRoadSr(Integer minDirtRoadSr) {
        this.minDirtRoadSr = minDirtRoadSr;
    }

    public Integer getMinDirtRoadLicenseLevel() {
        return minDirtRoadLicenseLevel;
    }

    public void setMinDirtRoadLicenseLevel(Integer minDirtRoadLicenseLevel) {
        this.minDirtRoadLicenseLevel = minDirtRoadLicenseLevel;
    }

    public Integer getMinIrating() {
        return minIrating;
    }

    public void setMinIrating(Integer minIrating) {
        this.minIrating = minIrating;
    }
}
