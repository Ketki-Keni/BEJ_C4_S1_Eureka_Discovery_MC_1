/*
 * Author : Ketki Keni
 * Date : 14-02-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.ApiGateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route(p->p.path("/api/v1/**")
                        .uri("http://localhost:8082/"))
                .route(p->p.path("/api/v2/**")
                        .uri("http://localhost:8083/"))
                .build();
    }
}
