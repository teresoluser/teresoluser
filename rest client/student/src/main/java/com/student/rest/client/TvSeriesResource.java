package com.student.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/tvseries")
public class TvSeriesResource {

    @RestClient
    TVSeriesProxy tvSeriesProxy;

    private List<TvSeries> tvseries= new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        TvSeries tvSeries = tvSeriesProxy.get("game of thrones");
        tvseries.add(tvSeries);
        return Response.ok(tvseries).build();
    }

}
