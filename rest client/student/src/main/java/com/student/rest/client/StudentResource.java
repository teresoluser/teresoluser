package com.student.rest.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource {

    @GET
    @Path("/s")
    @Produces(MediaType.TEXT_PLAIN)

    public String hello() {
             System.out.println(" Student Project here ");
        return " I am Student ";
    }
}