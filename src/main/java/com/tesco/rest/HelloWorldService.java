package com.tesco.rest;

import com.tesco.util.SendMessage;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by Praveen on 08/05/16.
 */
@Path("/hello")
public class HelloWorldService {

    private final transient ServletContextHandler servletContextHandler;

    public HelloWorldService(ServletContextHandler servletContextHandler) {
        this.servletContextHandler = servletContextHandler;
    }
    /**
     * GET status of app endpoint.
     * @return Response response
     * @throws Exception error
     */
    @GET
    @Path("/_status")
    public Response checkStatus() throws IOException
    {
        return Response.status(200).entity("200 OK").build();
    }
    @GET
    @Path("/hi")
    public Response getMsg() throws IOException{
        SendMessage responseMsg=new SendMessage();
        String output=responseMsg.test();
    return  Response.status(200).entity(output).build();
    }

}
