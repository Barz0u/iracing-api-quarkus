package com.basilus;

import com.basilus.iracing.manager.model.AuthResponse;
import com.basilus.iracing.manager.model.seasons.Season;
import com.basilus.iracing.manager.model.seasons.SeasonsResponse;
import com.basilus.iracing.manager.service.IracingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Resource for testing the iRacing API integration.
 * The authentication flow is:
 * 1. Call /iracing/auth to authenticate - this sets the cookies for subsequent calls
 * 2. Then use any of the other endpoints to retrieve data
 */
@Path("/iracing")
public class ExampleResource {

    @Inject
    IracingService iracingService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Authenticate with iRacing API.
     * This method must be called before any other API calls will work.
     * The authentication sets cookies which will be used for subsequent API calls.
     */
    @GET
    @Path("/auth")
    @Produces(MediaType.APPLICATION_JSON)
    public String authenticate() {
        try {
            String response = iracingService.authenticate();

            // Just to demonstrate that auth was successful
            AuthResponse auth = objectMapper.readValue(response, AuthResponse.class);
            return "{\"status\": \"success\", \"message\": \"Successfully authenticated with cookie-based auth\", \"custId\": " + auth.getCustId() + "}";
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }

    /**
     * Get information about the authenticated member.
     * Requires prior authentication.
     */
    @GET
    @Path("/member")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMemberInfo() {
        try {
            if (!iracingService.isAuthenticated()) {
                return "{\"status\": \"error\", \"message\": \"Not authenticated. Call /iracing/auth first.\"}";
            }
            return iracingService.getMemberInfo();
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }

    /**
     * Get information about current seasons.
     * Requires prior authentication.
     * This returns raw JSON, including the cached data if a cache link is provided.
     */
    @GET
    @Path("/seasons")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSeasons() {
        try {
            if (!iracingService.isAuthenticated()) {
                return "{\"status\": \"error\", \"message\": \"Not authenticated. Call /iracing/auth first.\"}";
            }
            return iracingService.getCurrentSeasons();
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }

    /**
     * Get information about current seasons using strongly-typed Java objects.
     * Requires prior authentication.
     * This uses the Java model classes to parse the response into Java objects.
     */
    @GET
    @Path("/seasons-typed")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSeasonsTyped() {
        try {
            if (!iracingService.isAuthenticated()) {
                return "{\"status\": \"error\", \"message\": \"Not authenticated. Call /iracing/auth first.\"}";
            }

            // Get the seasons as Java objects
            SeasonsResponse seasons = iracingService.getCurrentSeasonsAsObjects();

            // Simple example of working with the model - count active seasons
            int activeSeasons = 0;
            StringBuilder seriesNames = new StringBuilder();

            if (seasons.getSeasons() != null) {
                for (Season season : seasons.getSeasons()) {
                    if (season.isActive()) {
                        activeSeasons++;
                        if (!seriesNames.isEmpty()) {
                            seriesNames.append(", ");
                        }
                        seriesNames.append(season.getSeasonName());
                    }
                }
            }

            // Create a simplified response to demonstrate working with the model
            return String.format(
                    "{\"status\": \"success\", \"totalSeasons\": %d, \"activeSeasons\": %d, \"activeSeries\": \"%s\"}",
                    seasons.getSeasons() != null ? seasons.getSeasons().size() : 0,
                    activeSeasons,
                    seriesNames);
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }

    /**
     * Get information about tracks.
     * Requires prior authentication.
     */
    @GET
    @Path("/tracks")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTracks() {
        try {
            if (!iracingService.isAuthenticated()) {
                return "{\"status\": \"error\", \"message\": \"Not authenticated. Call /iracing/auth first.\"}";
            }
            return iracingService.getTracks();
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }

    /**
     * Get information about cars.
     * Requires prior authentication.
     */
    @GET
    @Path("/cars")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCars() {
        try {
            if (!iracingService.isAuthenticated()) {
                return "{\"status\": \"error\", \"message\": \"Not authenticated. Call /iracing/auth first.\"}";
            }
            return iracingService.getCars();
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }

    /**
     * Get information about your recent races.
     * Requires prior authentication.
     */
    @GET
    @Path("/recent-races")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRecentRaces() {
        try {
            if (!iracingService.isAuthenticated()) {
                return "{\"status\": \"error\", \"message\": \"Not authenticated. Call /iracing/auth first.\"}";
            }
            // Pass null to use the current user's ID
            return iracingService.getMemberRecentRaces(null);
        } catch (Exception e) {
            return "{\"status\": \"error\", \"message\": \"" + e.getMessage() + "\"}";
        }
    }
}
