package com.basilus.iracing.manager.service;

import com.basilus.iracing.manager.client.CacheLinkResolver;
import com.basilus.iracing.manager.client.IracingApiClient;
import com.basilus.iracing.manager.model.AuthResponse;
import com.basilus.iracing.manager.model.seasons.SeasonsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Service class that provides access to iRacing API functionality.
 * This service uses IracingApiClient to make API calls and handles authentication,
 * data conversion, and other business logic.
 */
@ApplicationScoped
public class IracingService {

    @Inject
    @RestClient
    IracingApiClient iracingApiClient;

    @Inject
    CacheLinkResolver cacheLinkResolver;

    @ConfigProperty(name = "iracing.login")
    String iracingLogin;

    @ConfigProperty(name = "iracing.password")
    String iracingPassword;

    private final ObjectMapper objectMapper = new ObjectMapper();

    // Store the customer ID once authenticated
    private Integer custId;
    private boolean authenticated = false;

    /**
     * Authenticates with the iRacing API using email and password.
     * The password is hashed according to iRacing's requirements before sending.
     * This method will set cookies in the client filter for subsequent API calls.
     *
     * @param email    User's iRacing email address
     * @param password User's iRacing password (plain text)
     * @return Authentication response from the API as JSON
     */
    public String authenticate() {
        return authenticate(iracingLogin, iracingPassword);
    }

    private String authenticate(String email, String password) {
        try {
            String hashedPassword = generateHashedPassword(email, password);
            Response response = iracingApiClient.authenticate(email, hashedPassword);

            // Read the response body as string
            String authResponseBody = response.readEntity(String.class);

            // Parse the auth response to extract customer ID
            AuthResponse auth = objectMapper.readValue(authResponseBody, AuthResponse.class);
            this.custId = auth.getCustId();
            this.authenticated = true;

            return authResponseBody;
        } catch (NoSuchAlgorithmException | IOException e) {
            throw new RuntimeException("Authentication failed: " + e.getMessage(), e);
        }
    }

    /**
     * Generates a SHA-256 hash of the password + email combination as required by iRacing API.
     *
     * @param email    User's email address
     * @param password User's password
     * @return Base64 encoded SHA-256 hash
     * @throws NoSuchAlgorithmException If SHA-256 algorithm is not available
     */
    private String generateHashedPassword(String email, String password) throws NoSuchAlgorithmException {
        String toHash = password + email.toLowerCase();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(toHash.getBytes(StandardCharsets.UTF_8));

        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(hash);
    }

    /**
     * Checks if the user is authenticated.
     *
     * @return true if the user has been authenticated, false otherwise
     */
    public boolean isAuthenticated() {
        return authenticated;
    }

    /**
     * Gets the current user's ID.
     *
     * @return The customer ID of the authenticated user
     */
    public Integer getCurrentUserId() {
        return custId;
    }

    /**
     * Sets the authentication state manually.
     * This can be used when authentication was performed externally.
     *
     * @param authenticated Whether the user is authenticated
     * @param custId        Customer ID of the authenticated user
     */
    public void setAuthenticated(boolean authenticated, Integer custId) {
        this.authenticated = authenticated;
        this.custId = custId;
    }

    /**
     * Gets information about the currently authenticated member.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Member information in JSON format
     */
    public String getMemberInfo() {
        checkAuthentication();
        String response = iracingApiClient.getMemberInfo();
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets information about the current racing seasons.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Current season information in JSON format
     */
    public String getCurrentSeasons() {
        checkAuthentication();
        String response = iracingApiClient.getCurrentSeasons();
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets information about the current racing seasons and parses it into Java objects.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Current season information as Java objects
     * @throws IOException If there is an error parsing the JSON response
     */
    public SeasonsResponse getCurrentSeasonsAsObjects() throws IOException {
        String seasonsJson = getCurrentSeasons();
        return objectMapper.readValue(seasonsJson, SeasonsResponse.class);
    }

    /**
     * Gets information about available series.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Series information in JSON format
     */
    public String getSeries() {
        checkAuthentication();
        String response = iracingApiClient.getSeries();
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets information about all available tracks.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Track information in JSON format
     */
    public String getTracks() {
        checkAuthentication();
        String response = iracingApiClient.getTracks();
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets information about all available cars.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Car information in JSON format
     */
    public String getCars() {
        checkAuthentication();
        String response = iracingApiClient.getCars();
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets race results for a specific subsession.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @param subsessionId The ID of the subsession
     * @return Race results in JSON format
     */
    public String getResults(String subsessionId) {
        checkAuthentication();
        String response = iracingApiClient.getResults(subsessionId);
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets career statistics for a specific member.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @param customerId The customer ID of the member, or null for the current user
     * @return Member's career statistics in JSON format
     */
    public String getMemberCareerStats(String customerId) {
        checkAuthentication();
        String custId = customerId != null ? customerId : this.custId.toString();
        String response = iracingApiClient.getMemberCareerStats(custId);
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets recent race results for a specific member.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @param customerId The customer ID of the member, or null for the current user
     * @return Member's recent race results in JSON format
     */
    public String getMemberRecentRaces(String customerId) {
        checkAuthentication();
        String custId = customerId != null ? customerId : this.custId.toString();
        String response = iracingApiClient.getMemberRecentRaces(custId);
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Gets championship data.
     * If the API returns a cache link, this method will follow it to get the actual data.
     *
     * @return Championship data in JSON format
     */
    public String getChampionshipData() {
        checkAuthentication();
        String response = iracingApiClient.getChampionshipData();
        return cacheLinkResolver.resolveResponse(response);
    }

    /**
     * Checks if the user is authenticated and throws an exception if not.
     */
    private void checkAuthentication() {
        if (!isAuthenticated()) {
            throw new RuntimeException("Not authenticated. Call authenticate() first.");
        }
    }
} 