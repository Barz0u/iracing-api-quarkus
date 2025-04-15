package com.basilus.iracing.manager.model.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the league information response from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueResponse {

    @JsonProperty("league_id")
    private int leagueId;

    @JsonProperty("league_name")
    private String leagueName;

    @JsonProperty("about")
    private String about;

    @JsonProperty("url")
    private String url;

    @JsonProperty("owner_id")
    private int ownerId;

    @JsonProperty("owner_name")
    private String ownerName;

    @JsonProperty("created")
    private String created;

    @JsonProperty("roster_count")
    private int rosterCount;

    @JsonProperty("recruiting")
    private boolean recruiting;

    @JsonProperty("is_admin")
    private boolean isAdmin;

    @JsonProperty("is_member")
    private boolean isMember;

    @JsonProperty("is_watched")
    private boolean isWatched;

    @JsonProperty("minimum_requirements")
    private LeagueRequirements minimumRequirements;

    // Getters and setters

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getRosterCount() {
        return rosterCount;
    }

    public void setRosterCount(int rosterCount) {
        this.rosterCount = rosterCount;
    }

    public boolean isRecruiting() {
        return recruiting;
    }

    public void setRecruiting(boolean recruiting) {
        this.recruiting = recruiting;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
    }

    public LeagueRequirements getMinimumRequirements() {
        return minimumRequirements;
    }

    public void setMinimumRequirements(LeagueRequirements minimumRequirements) {
        this.minimumRequirements = minimumRequirements;
    }
}
