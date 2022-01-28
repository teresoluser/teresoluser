package com.emailExample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.smallrye.common.annotation.Blocking;

@Path("/hello")
public class GreetingResource {

    @Inject
     Mailer mailer;

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String hello() {
    //     return "Hello RESTEasy";
    // }

    @GET                                                                
    @Blocking                                                           
    public void sendEmail() {
        mailer.send(
                Mail.withText("toabdulrehmankhaskheli123@gmail.com",                     
                    "dear Abdul Rehman THis email is test email  tested By Abdul REHMAN Khaskheli ",
                    " this is practice of email sending from quarkus to client ... ."
                )
        );
            
    }
}