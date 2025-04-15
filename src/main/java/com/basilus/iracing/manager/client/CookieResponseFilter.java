package com.basilus.iracing.manager.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.core.NewCookie;
import org.jboss.logging.Logger;

import java.util.Map;

/**
 * Response filter that captures cookies from responses and stores them for future requests.
 */
@ApplicationScoped
public class CookieResponseFilter implements ClientResponseFilter {
    private static final Logger LOG = Logger.getLogger(CookieResponseFilter.class);

    @Inject
    CookieClientFilter cookieClientFilter;

    @Override
    public void filter(jakarta.ws.rs.client.ClientRequestContext requestContext, ClientResponseContext responseContext) {
        // Only process Set-Cookie headers from responses
        Map<String, NewCookie> cookies = responseContext.getCookies();

        if (!cookies.isEmpty()) {
            LOG.debug("Received cookies: " + cookies.keySet());

            for (NewCookie cookie : cookies.values()) {
                cookieClientFilter.addCookie(cookie.getName(), cookie.getValue());
            }
        }

        // Also check for Set-Cookie headers directly (some servers use this instead of the Cookie API)
        if (responseContext.getHeaders().containsKey("Set-Cookie")) {
            LOG.debug("Processing Set-Cookie headers");

            for (String header : responseContext.getHeaders().get("Set-Cookie")) {
                processCookieHeader(header);
            }
        }
    }

    /**
     * Parse a Set-Cookie header and extract cookie name and value.
     *
     * @param cookieHeader The Set-Cookie header value
     */
    private void processCookieHeader(String cookieHeader) {
        // Simple parsing of cookie header to extract name and value
        String[] parts = cookieHeader.split(";")[0].split("=", 2);
        if (parts.length == 2) {
            String name = parts[0].trim();
            String value = parts[1].trim();
            LOG.debug("Extracted cookie from header: " + name);
            cookieClientFilter.addCookie(name, value);
        }
    }
}
