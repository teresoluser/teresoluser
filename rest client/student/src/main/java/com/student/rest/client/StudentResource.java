package com.student.rest.client;

import com.student.rest.client.models.StudentDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource {

    @POST
    @Path("/s")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public String hello(StudentDTO studentDTO ) {
             System.out.println(" Student Project here 123  ");

//        studentDTO.setId(10);
//        studentDTO.setStuName("Abdu Rehman");
//        studentDTO.setStuRoll("06");
//        studentDTO.setStuPhone("0307545451");
//        studentDTO.setStuAddress("Sakrand");

        return "studentDTO";
    }
}