package com.basilus.iracing.manager.model.championship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents the championship data response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionshipResponse {

    @JsonProperty("series_id")
    private int seriesId;

    @JsonProperty("series_name")
    private String seriesName;

    @JsonProperty("season_id")
    private int seasonId;

    @JsonProperty("season_name")
    private String seasonName;

    @JsonProperty("race_week_num")
    private int raceWeekNum;

    @JsonProperty("car_class_ids")
    private List<Integer> carClassIds;

    @JsonProperty("data")
    private List<ChampionshipData> data;

    // Getters and setters

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public int getRaceWeekNum() {
        return raceWeekNum;
    }

    public void setRaceWeekNum(int raceWeekNum) {
        this.raceWeekNum = raceWeekNum;
    }

    public List<Integer> getCarClassIds() {
        return carClassIds;
    }

    public void setCarClassIds(List<Integer> carClassIds) {
        this.carClassIds = carClassIds;
    }

    public List<ChampionshipData> getData() {
        return data;
    }

    public void setData(List<ChampionshipData> data) {
        this.data = data;
    }
}
