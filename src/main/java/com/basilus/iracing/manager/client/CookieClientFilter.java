package com.basilus.iracing.manager.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.Cookie;
import jakarta.ws.rs.core.MultivaluedMap;
import org.jboss.logging.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Client filter that adds stored cookies to outgoing requests.
 */
@ApplicationScoped
public class CookieClientFilter implements ClientRequestFilter {
    private static final Logger LOG = Logger.getLogger(CookieClientFilter.class);

    private final Map<String, Cookie> cookies = new HashMap<>();

    @Override
    public void filter(ClientRequestContext requestContext) {
        if (!cookies.isEmpty()) {
            LOG.debug("Adding cookies to request: " + cookies.keySet());
            MultivaluedMap<String, Object> headers = requestContext.getHeaders();

            // Build cookie header string
            StringBuilder cookieHeader = new StringBuilder();
            boolean first = true;
            for (Cookie cookie : cookies.values()) {
                if (!first) {
                    cookieHeader.append("; ");
                }
                cookieHeader.append(cookie.getName()).append("=").append(cookie.getValue());
                first = false;
            }

            // Add cookie header to request
            headers.add("Cookie", cookieHeader.toString());
        }
    }

    /**
     * Store a cookie to be sent with future requests.
     *
     * @param name  Cookie name
     * @param value Cookie value
     */
    public void addCookie(String name, String value) {
        LOG.debug("Adding cookie: " + name);
        cookies.put(name, new Cookie.Builder(name).value(value).build());
    }

    /**
     * Clear all stored cookies.
     */
    public void clearCookies() {
        LOG.debug("Clearing all cookies");
        cookies.clear();
    }
}
