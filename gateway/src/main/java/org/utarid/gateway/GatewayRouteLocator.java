package org.utarid.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRouteLocator {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ServerOne", r -> r
                        .path("/one/**")
                        .uri("http://localhost:8081"))
                .route("ServerTwo", r -> r
                        .path("/two/**")
                        .filters(f -> f.setStatus(201))
                        .uri("http://localhost:8082")
                )
                .build();
    }
}
