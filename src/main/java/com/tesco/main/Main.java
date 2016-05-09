package com.tesco.main;

import com.tesco.rest.HelloWorldService;
import org.eclipse.jetty.io.RuntimeIOException;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    public static void main(String[] args) throws Exception {
        {
            final Logger logger = LoggerFactory.getLogger(Main.class);
            System.out.println("Hello world!!!!!");
            logger.info("Hello world\n");

            ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
            context.setContextPath("/");

            Server jettyServer = new Server(8080);
            jettyServer.setHandler(context);

            ServletHolder jerseyServlet = context.addServlet(
                    org.glassfish.jersey.servlet.ServletContainer.class, "/*");
            jerseyServlet.setInitOrder(0);

            jerseyServlet.setInitParameter(
                    "jersey.config.server.provider.classnames",
                    HelloWorldService.class.getCanonicalName());

            try {
                jettyServer.start();
                jettyServer.join();
            } finally {
                jettyServer.destroy();
            }

        }
    }

    public static String test() {

        return "Hello world";
    }

}
