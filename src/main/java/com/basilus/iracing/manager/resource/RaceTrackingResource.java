package com.basilus.iracing.manager.resource;

import com.basilus.iracing.manager.model.tracking.RaceChange;
import com.basilus.iracing.manager.model.tracking.TrackedMember;
import com.basilus.iracing.manager.service.RaceTrackingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

/**
 * Resource for managing race tracking functionality.
 */
@Path("/tracking")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RaceTrackingResource {

    @Inject
    RaceTrackingService trackingService;

    /**
     * Start tracking a member by customer ID.
     *
     * @param custId      Customer ID to track
     * @param displayName Display name of the member
     * @return Success message or error
     */
    @POST
    @Path("/members")
    public Response trackMember(
            @QueryParam("custId") int custId,
            @QueryParam("displayName") String displayName) {

        boolean success = trackingService.trackMember(custId, displayName);

        if (success) {
            return Response.ok()
                    .entity("{\"status\": \"success\", \"message\": \"Now tracking member " + displayName + " (" + custId + ")\"}")
                    .build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("{\"status\": \"error\", \"message\": \"Member is already being tracked or an error occurred\"}")
                    .build();
        }
    }

    /**
     * Stop tracking a member.
     *
     * @param custId Customer ID to stop tracking
     * @return Success message or error
     */
    @DELETE
    @Path("/members/{custId}")
    public Response stopTrackingMember(@PathParam("custId") int custId) {
        boolean success = trackingService.stopTrackingMember(custId);

        if (success) {
            return Response.ok()
                    .entity("{\"status\": \"success\", \"message\": \"Stopped tracking member with ID " + custId + "\"}")
                    .build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("{\"status\": \"error\", \"message\": \"Member with ID " + custId + " is not being tracked\"}")
                    .build();
        }
    }

    /**
     * Get a list of all tracked members.
     *
     * @return List of tracked members
     */
    @GET
    @Path("/members")
    public List<TrackedMember> getTrackedMembers() {
        return trackingService.getTrackedMembers();
    }

    /**
     * Get recent race changes.
     *
     * @return List of recent race changes
     */
    @GET
    @Path("/changes")
    public List<RaceChange> getRecentChanges() {
        return trackingService.getRecentChanges();
    }

    /**
     * Clear the list of recent changes.
     *
     * @return Success message
     */
    @DELETE
    @Path("/changes")
    public Response clearRecentChanges() {
        trackingService.clearRecentChanges();
        return Response.ok()
                .entity("{\"status\": \"success\", \"message\": \"Cleared recent changes\"}")
                .build();
    }

    /**
     * Manually trigger a check for race changes.
     *
     * @return List of detected race changes
     */
    @POST
    @Path("/check")
    public List<RaceChange> manualCheck() {
        return trackingService.manualCheck();
    }
}
