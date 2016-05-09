package com.tesco.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by Praveen on 08/05/16.
 */
@Path("/hello")
public class HelloWorldService {
    @GET
    @Path("{param}")
    public Response getMsg(@PathParam("param") String msg){

        String output= "Jersey says: "+msg;
    return  Response.status(200).entity(output).build();
    }
}
