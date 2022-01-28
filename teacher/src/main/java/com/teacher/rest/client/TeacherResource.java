package com.teacher.rest.client;

import com.teacher.rest.client.models.StudentDTO;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/teacher")
public class TeacherResource {


    @RestClient
    TeacherService teacherService;

    @Inject
    StudentDTO studentDTO;

//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//   // @Consumes(MediaType.APPLICATION_JSON)
//    public String hello( StudentDTO studentDTO ) {
//
//        System.out.println(" Teacher Project here ");
//        String name=teacherService.callStudent(studentDTO);
//        System.out.println(" Id :" +studentDTO.getId());
//        System.out.println(" Name " +studentDTO.getStuName());
//        System.out.println(" Roll No :" +studentDTO.getStuRoll() );
//        System.out.println(" Phone : " +studentDTO.getStuPhone());
//        System.out.println(" Address :  "+ studentDTO.getStuAddress());
//        return name;
//    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    // @Consumes(MediaType.APPLICATION_JSON)
    public List hello( StudentDTO studentDTO ) {

        List list = new ArrayList();

        System.out.println(" Teacher Project here ");
        String name=teacherService.callStudent(studentDTO);
        System.out.println(" Id :" +studentDTO.getId());
        System.out.println(" Name " +studentDTO.getStuName());
        System.out.println(" Roll No :" +studentDTO.getStuRoll() );
        System.out.println(" Phone : " +studentDTO.getStuPhone());
        System.out.println(" Address :  "+ studentDTO.getStuAddress());

        list.add(studentDTO);
        return list;
    }

}