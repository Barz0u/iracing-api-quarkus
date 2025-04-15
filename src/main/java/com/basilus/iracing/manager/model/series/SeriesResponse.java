package com.basilus.iracing.manager.model.series;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the series response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeriesResponse {

    @JsonProperty("series")
    private List<Series> series;

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }
}
