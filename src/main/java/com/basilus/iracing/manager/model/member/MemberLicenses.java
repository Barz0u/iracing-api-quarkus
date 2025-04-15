package com.basilus.iracing.manager.model.member;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Represents member licenses from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberLicenses {

    @JsonProperty("oval")
    private License oval;

    @JsonProperty("road")
    private License road;

    @JsonProperty("dirt_oval")
    private License dirtOval;

    @JsonProperty("dirt_road")
    private License dirtRoad;

    @JsonProperty("pro_oval")
    private Map<String, Object> proOval;

    @JsonProperty("pro_road")
    private Map<String, Object> proRoad;

    // Getters and setters

    public License getOval() {
        return oval;
    }

    public void setOval(License oval) {
        this.oval = oval;
    }

    public License getRoad() {
        return road;
    }

    public void setRoad(License road) {
        this.road = road;
    }

    public License getDirtOval() {
        return dirtOval;
    }

    public void setDirtOval(License dirtOval) {
        this.dirtOval = dirtOval;
    }

    public License getDirtRoad() {
        return dirtRoad;
    }

    public void setDirtRoad(License dirtRoad) {
        this.dirtRoad = dirtRoad;
    }

    public Map<String, Object> getProOval() {
        return proOval;
    }

    public void setProOval(Map<String, Object> proOval) {
        this.proOval = proOval;
    }

    public Map<String, Object> getProRoad() {
        return proRoad;
    }

    public void setProRoad(Map<String, Object> proRoad) {
        this.proRoad = proRoad;
    }
}
