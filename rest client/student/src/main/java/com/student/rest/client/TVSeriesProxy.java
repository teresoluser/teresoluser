package com.student.rest.client;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/singlesearch/")
@Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)

@RegisterRestClient(configKey="sms")
public interface TVSeriesProxy {

    @GET
    @Path("/shows")
    TvSeries get(@QueryParam("g") String title);

}
