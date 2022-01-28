package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {


    @Inject
    ServiceClass serviceClass;


    @GET
    @Path("/getAll")
    public List<Employee> hello() throws SQLException {

      return serviceClass.showAllPersons();
    }

    @GET
    @Path("/getById/{id}")
    public Employee getById(@PathParam("id") int id){
      return  serviceClass.showById(id);
    }


    @PUT
    @Path("/update/{id}")
    public Integer insertByObject(@PathParam("id") int id ,Employee employee){
        System.out.println("   Update endpoint calls ");
        return  serviceClass.updateByIdService( id,employee);
    }

    @POST
    @Path("/insert/{Personid}/{FirstName}/{LastName}/{Age}")
    public Integer insert(@PathParam( "Personid") int id, @PathParam("FirstName") String fname,@PathParam("LastName") String lname,@PathParam("Age") int age) {
        System.out.println(fname);
        return  serviceClass.insert(id,fname,lname,age);
    }

    @POST
    @Path("/insertByObject")
    public Integer insertByObject(Employee employee){
        System.out.println(employee.getLastName());
        return  serviceClass.insert(employee);
    }
}