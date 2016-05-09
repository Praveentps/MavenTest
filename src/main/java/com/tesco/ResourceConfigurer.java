package com.tesco;

import com.tesco.rest.HelloWorldService;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * The resource configuration for configuring a Publisher REST endpoint.
 * @author Praveen
 *
 */
public class ResourceConfigurer extends ResourceConfig {

    /**
     * Registers application components required for JAX-RS runtime.
     */
    public ResourceConfigurer() {

        // Spring filter to provide a bridge between JAX-RS and Spring
        register(RequestContextFilter.class);

        // Register Publisher resource class
        register(HelloWorldService.class);



    }
}