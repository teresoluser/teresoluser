package com.teacher.rest.client;

import com.teacher.rest.client.models.StudentDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(baseUri = "http://localhost:8090")
@ApplicationScoped
public interface TeacherService {


    @POST
    @Path("/s")
    @Produces(MediaType.APPLICATION_JSON)
   // @Consumes(MediaType.APPLICATION_JSON)
    public String callStudent(StudentDTO studentDTO );

    //    @GET
//    @Path("/extensions")
//    Set<Extension> getExtensionsById(@QueryParam("id") String id);
//
//    class Extension {
//        public String id;
//        public String name;
//        public String shortName;
//        public List<String> keywords;
//    }

}
