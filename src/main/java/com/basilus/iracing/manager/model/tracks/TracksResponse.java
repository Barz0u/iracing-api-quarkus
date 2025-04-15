package com.basilus.iracing.manager.model.tracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the tracks response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TracksResponse {

    @JsonProperty("tracks")
    private List<TrackInfo> tracks;

    public List<TrackInfo> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackInfo> tracks) {
        this.tracks = tracks;
    }
}
