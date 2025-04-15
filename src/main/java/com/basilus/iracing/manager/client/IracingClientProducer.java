package com.basilus.iracing.manager.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.UriBuilder;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.jboss.logging.Logger;

import java.net.URI;

/**
 * Producer for the IracingApiClient with cookie support.
 */
@ApplicationScoped
public class IracingClientProducer {
    private static final Logger LOG = Logger.getLogger(IracingClientProducer.class);

    @ConfigProperty(name = "quarkus.rest-client.iracing-api.url")
    String baseUrl;

    @Inject
    CookieClientFilter cookieClientFilter;

    @Inject
    CookieResponseFilter cookieResponseFilter;

    /**
     * Produces an instance of IracingApiClient with cookie management.
     *
     * @return An instance of IracingApiClient
     */
    @Produces
    @ApplicationScoped
    public IracingApiClient produceClient() {
        LOG.info("Creating IracingApiClient with baseUrl: " + baseUrl);

        URI uri = UriBuilder.fromUri(baseUrl).build();
        return RestClientBuilder.newBuilder()
                .baseUri(uri)
                .register(cookieClientFilter)
                .register(cookieResponseFilter)
                .build(IracingApiClient.class);
    }
}
