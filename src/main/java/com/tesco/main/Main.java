package com.tesco.main;

import com.tesco.rest.HelloWorldService;
import org.eclipse.jetty.io.RuntimeIOException;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;


public class Main {

    public static void main(String[] args) throws Exception {
        {
            final Logger logger = LoggerFactory.getLogger(Main.class);
            System.out.println("Hello world!!!!!");
            logger.info("Hello world\n");

            ServletContextHandler context = new ServletContextHandler();
            context.setContextPath("/");

            Server jettyServer = new Server(8080);
            jettyServer.setHandler(context);
            Servlet helloWorld = new HelloWorldService(context);
            context.addServlet( new ServletHolder(helloWorld), "/*");
            context.setInitParameter("","");
            try {
                jettyServer.start();
                jettyServer.join();
            } finally {
                jettyServer.destroy();
            }

        }
    }

}
