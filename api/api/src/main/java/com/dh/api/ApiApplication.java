package com.dh.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableCircuitBreaker
//@EnableDiscoveryClient
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("trorapi", r -> r.path("/api/hello")
//                        .filters( rw -> rw.rewritePath( "/api/hello" , "/tror/hello" ))
//                        .uri("http://localhost:8081"))
//                .route("tror", r -> r.path("/**/hello")
//                        .uri("http://localhost:8081"))
//                .route("pma", r -> r.path("/hi")
//                        .filters(f -> f.prefixPath("/pma"))
//                        .uri("http://localhost:8082"))
//                .build();
//    }

}

