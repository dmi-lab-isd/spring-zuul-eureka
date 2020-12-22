package com.space.scanner.gateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Configuration
public class SwaggerConfig {
    
    @Autowired
    @Primary
    @Bean
    public SwaggerResourcesProvider swaggerResourcesProvider(RouteLocator routeLocator) {
        System.out.println(routeLocator.getRoutes());
        return () -> {
            List<SwaggerResource> resources = new ArrayList<>();
            routeLocator.getRoutes().forEach(route -> resources.add(
                swaggerResource(route.getId(), route.getFullPath().replace("**", "v2/api-docs"),"2.0")));
            return resources;
        };
    }
    
    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}