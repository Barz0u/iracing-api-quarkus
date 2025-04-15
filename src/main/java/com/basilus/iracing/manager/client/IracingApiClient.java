package com.basilus.iracing.manager.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * REST client interface for the iRacing API.
 * Authentication is handled via cookies which are managed by CookieClientFilter and CookieResponseFilter.
 */
public interface IracingApiClient {

    /**
     * Authenticate with the iRacing API.
     * This will set cookies that will be used for subsequent API calls.
     *
     * @param email    User's iRacing email
     * @param password User's iRacing password (hashed before sending)
     * @return The authentication response
     */
    @POST
    @Path("/auth")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Response authenticate(
            @FormParam("email") String email,
            @FormParam("password") String password
    );

    /**
     * Get information about the currently authenticated member.
     *
     * @return Member information
     */
    @GET
    @Path("/data/member/get")
    @Produces(MediaType.APPLICATION_JSON)
    String getMemberInfo();

    /**
     * Get information about current racing seasons.
     *
     * @return Season information
     */
    @GET
    @Path("/data/series/seasons")
    @Produces(MediaType.APPLICATION_JSON)
    String getCurrentSeasons();

    /**
     * Get information about available series.
     *
     * @return Series information
     */
    @GET
    @Path("/data/series/get")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeries();

    /**
     * Get results for a specific subsession.
     *
     * @param subsessionId The ID of the subsession
     * @return Race results
     */
    @GET
    @Path("/data/results/get")
    @Produces(MediaType.APPLICATION_JSON)
    String getResults(@QueryParam("subsession_id") String subsessionId);

    /**
     * Get information about all available tracks.
     *
     * @return Track information
     */
    @GET
    @Path("/data/lookup/tracks")
    @Produces(MediaType.APPLICATION_JSON)
    String getTracks();

    /**
     * Get information about all available cars.
     *
     * @return Car information
     */
    @GET
    @Path("/data/lookup/cars")
    @Produces(MediaType.APPLICATION_JSON)
    String getCars();

    /**
     * Get career statistics for a specific member.
     *
     * @param customerId The customer ID of the member
     * @return Member's career statistics
     */
    @GET
    @Path("/data/stats/member_career")
    @Produces(MediaType.APPLICATION_JSON)
    String getMemberCareerStats(@QueryParam("cust_id") String customerId);

    /**
     * Get recent race results for a specific member.
     *
     * @param customerId The customer ID of the member
     * @return Member's recent race results
     */
    @GET
    @Path("/data/stats/member_recent_races")
    @Produces(MediaType.APPLICATION_JSON)
    String getMemberRecentRaces(@QueryParam("cust_id") String customerId);

    /**
     * Get information about current championships.
     *
     * @return Championship information
     */
    @GET
    @Path("/data/series/chart_data")
    @Produces(MediaType.APPLICATION_JSON)
    String getChampionshipData();

    /**
     * Get driver standings for a specific season.
     *
     * @param seasonId    The ID of the season
     * @param carClassId  The ID of the car class (optional)
     * @param clubId      The ID of the club (optional)
     * @param division    The division number (optional)
     * @param raceWeekNum The race week number (optional)
     * @return Driver standings
     */
    @GET
    @Path("/data/stats/season_driver_standings")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeasonDriverStandings(
            @QueryParam("season_id") String seasonId,
            @QueryParam("car_class_id") String carClassId,
            @QueryParam("club_id") String clubId,
            @QueryParam("division") String division,
            @QueryParam("race_week_num") String raceWeekNum
    );

    /**
     * Get team standings for a specific season.
     *
     * @param seasonId    The ID of the season
     * @param carClassId  The ID of the car class (optional)
     * @param raceWeekNum The race week number (optional)
     * @return Team standings
     */
    @GET
    @Path("/data/stats/season_team_standings")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeasonTeamStandings(
            @QueryParam("season_id") String seasonId,
            @QueryParam("car_class_id") String carClassId,
            @QueryParam("race_week_num") String raceWeekNum
    );

    /**
     * Get qualifying results for a specific season.
     *
     * @param seasonId    The ID of the season
     * @param carClassId  The ID of the car class (optional)
     * @param clubId      The ID of the club (optional)
     * @param division    The division number (optional)
     * @param raceWeekNum The race week number (optional)
     * @return Qualifying results
     */
    @GET
    @Path("/data/stats/season_qualify_results")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeasonQualifyResults(
            @QueryParam("season_id") String seasonId,
            @QueryParam("car_class_id") String carClassId,
            @QueryParam("club_id") String clubId,
            @QueryParam("division") String division,
            @QueryParam("race_week_num") String raceWeekNum
    );

    /**
     * Get time trial results for a specific season.
     *
     * @param seasonId    The ID of the season
     * @param carClassId  The ID of the car class (optional)
     * @param clubId      The ID of the club (optional)
     * @param division    The division number (optional)
     * @param raceWeekNum The race week number (optional)
     * @return Time trial results
     */
    @GET
    @Path("/data/stats/season_tt_results")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeasonTimeTrialResults(
            @QueryParam("season_id") String seasonId,
            @QueryParam("car_class_id") String carClassId,
            @QueryParam("club_id") String clubId,
            @QueryParam("division") String division,
            @QueryParam("race_week_num") String raceWeekNum
    );

    /**
     * Get race statistics for a specific season.
     *
     * @param seasonId    The ID of the season
     * @param carClassId  The ID of the car class (optional)
     * @param clubId      The ID of the club (optional)
     * @param raceWeekNum The race week number (optional)
     * @return Race statistics
     */
    @GET
    @Path("/data/stats/season_race_stats")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeasonRaceStats(
            @QueryParam("season_id") String seasonId,
            @QueryParam("car_class_id") String carClassId,
            @QueryParam("club_id") String clubId,
            @QueryParam("race_week_num") String raceWeekNum
    );

    /**
     * Get supersession standings for a specific season.
     *
     * @param seasonId    The ID of the season
     * @param carClassId  The ID of the car class (optional)
     * @param raceWeekNum The race week number (optional)
     * @return Supersession standings
     */
    @GET
    @Path("/data/stats/season_supersession_standings")
    @Produces(MediaType.APPLICATION_JSON)
    String getSeasonSupersessionStandings(
            @QueryParam("season_id") String seasonId,
            @QueryParam("car_class_id") String carClassId,
            @QueryParam("race_week_num") String raceWeekNum
    );

    /**
     * Get world records for a specific season.
     *
     * @param carId         The ID of the car
     * @param trackId       The ID of the track
     * @param seasonYear    The year of the season (optional)
     * @param seasonQuarter The quarter of the season (optional)
     * @return World records
     */
    @GET
    @Path("/data/stats/world_records")
    @Produces(MediaType.APPLICATION_JSON)
    String getWorldRecords(
            @QueryParam("car_id") String carId,
            @QueryParam("track_id") String trackId,
            @QueryParam("season_year") String seasonYear,
            @QueryParam("season_quarter") String seasonQuarter
    );

    /**
     * Get driver search results.
     *
     * @param searchTerm The search term for finding drivers
     * @return Driver search results
     */
    @GET
    @Path("/data/lookup/drivers")
    @Produces(MediaType.APPLICATION_JSON)
    String searchDrivers(@QueryParam("search_term") String searchTerm);

    /**
     * Get information about a specific league.
     *
     * @param leagueId The ID of the league
     * @return League information
     */
    @GET
    @Path("/data/league/get")
    @Produces(MediaType.APPLICATION_JSON)
    String getLeague(@QueryParam("league_id") String leagueId);

    /**
     * Get roster for a specific league.
     *
     * @param leagueId The ID of the league
     * @param seasonId The ID of the season (optional)
     * @return League roster
     */
    @GET
    @Path("/data/league/roster")
    @Produces(MediaType.APPLICATION_JSON)
    String getLeagueRoster(
            @QueryParam("league_id") String leagueId,
            @QueryParam("season_id") String seasonId
    );

    /**
     * Get seasons for a specific league.
     *
     * @param leagueId The ID of the league
     * @return League seasons
     */
    @GET
    @Path("/data/league/seasons")
    @Produces(MediaType.APPLICATION_JSON)
    String getLeagueSeasons(@QueryParam("league_id") String leagueId);

    /**
     * Get membership for a specific league.
     *
     * @param leagueId The ID of the league
     * @return League membership
     */
    @GET
    @Path("/data/league/membership")
    @Produces(MediaType.APPLICATION_JSON)
    String getLeagueMembership(@QueryParam("league_id") String leagueId);

    /**
     * Get directory of leagues.
     *
     * @param search               The search term for finding leagues (optional)
     * @param tag                  The tag to filter leagues (optional)
     * @param restrictToMember     Whether to restrict to leagues the member is in (optional)
     * @param restrictToRecruiting Whether to restrict to leagues that are recruiting (optional)
     * @param restrictToFriends    Whether to restrict to leagues that friends are in (optional)
     * @param restrictToWatched    Whether to restrict to leagues that are being watched (optional)
     * @param minimum              The minimum number of members (optional)
     * @param maximum              The maximum number of members (optional)
     * @param offset               The offset for pagination (optional)
     * @param sort                 The sort order (optional)
     * @param order                The ordering direction (optional)
     * @return League directory
     */
    @GET
    @Path("/data/league/directory")
    @Produces(MediaType.APPLICATION_JSON)
    String getLeagueDirectory(
            @QueryParam("search") String search,
            @QueryParam("tag") String tag,
            @QueryParam("restrict_to_member") Boolean restrictToMember,
            @QueryParam("restrict_to_recruiting") Boolean restrictToRecruiting,
            @QueryParam("restrict_to_friends") Boolean restrictToFriends,
            @QueryParam("restrict_to_watched") Boolean restrictToWatched,
            @QueryParam("minimum") Integer minimum,
            @QueryParam("maximum") Integer maximum,
            @QueryParam("offset") Integer offset,
            @QueryParam("sort") String sort,
            @QueryParam("order") String order
    );

    /**
     * Get league points systems.
     *
     * @param leagueId The ID of the league
     * @return League points systems
     */
    @GET
    @Path("/data/league/points_systems")
    @Produces(MediaType.APPLICATION_JSON)
    String getLeaguePointsSystems(@QueryParam("league_id") String leagueId);
}
