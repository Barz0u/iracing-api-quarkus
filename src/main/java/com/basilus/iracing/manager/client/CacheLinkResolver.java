package com.basilus.iracing.manager.client;

import com.basilus.iracing.manager.model.CacheLinkResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.io.IOException;

/**
 * Helper class for resolving cache links returned by the iRacing API.
 * The iRacing API often returns links to cached data rather than the data itself.
 * This class handles following those links to retrieve the actual data.
 */
@ApplicationScoped
public class CacheLinkResolver {
    private static final Logger LOG = Logger.getLogger(CacheLinkResolver.class);

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Client httpClient = ClientBuilder.newClient();

    /**
     * Resolves a cache link response by checking if it's a link response
     * and if so, following the link to get the actual data.
     *
     * @param response The API response which might be a cache link
     * @return The actual data, either the original response if it wasn't a cache link,
     * or the data retrieved from following the cache link
     */
    public String resolveResponse(String response) {
        try {
            // Try to parse as cache link
            CacheLinkResponse cacheLink = objectMapper.readValue(response, CacheLinkResponse.class);

            // Check if this is actually a cache link response
            if (cacheLink.getLink() != null && !cacheLink.getLink().isEmpty()) {
                LOG.info("Following cache link: " + cacheLink.getLink());
                return followCacheLink(cacheLink.getLink());
            }

            // If we got here, it wasn't a cache link response, so return the original
            return response;
        } catch (IOException e) {
            // Not a cache link JSON format, just return the original response
            return response;
        } catch (Exception e) {
            LOG.error("Error following cache link", e);
            throw new RuntimeException("Failed to resolve cache link: " + e.getMessage(), e);
        }
    }

    /**
     * Follows a cache link to retrieve the actual data.
     *
     * @param link The cache link URL
     * @return The data retrieved from the cache link
     */
    private String followCacheLink(String link) {
        return httpClient.target(link)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
    }
}
