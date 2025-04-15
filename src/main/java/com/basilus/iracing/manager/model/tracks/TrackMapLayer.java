package com.basilus.iracing.manager.model.tracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a track map layer in the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackMapLayer {

    @JsonProperty("layer_name")
    private String layerName;

    @JsonProperty("layer_order")
    private int layerOrder;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("is_optional")
    private boolean isOptional;

    @JsonProperty("default_visibility")
    private boolean defaultVisibility;

    // Getters and setters

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    public int getLayerOrder() {
        return layerOrder;
    }

    public void setLayerOrder(int layerOrder) {
        this.layerOrder = layerOrder;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean optional) {
        isOptional = optional;
    }

    public boolean isDefaultVisibility() {
        return defaultVisibility;
    }

    public void setDefaultVisibility(boolean defaultVisibility) {
        this.defaultVisibility = defaultVisibility;
    }
}
