package app.vercel.leonanthomaz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	public RouteLocator routes(RouteLocatorBuilder builder){
		return builder
				.routes()
				.route(r -> r.path("/products/**").uri("lb://msproduct"))
				.route(r -> r.path("/orders/**").uri("lb://msorder"))
				.route(r -> r.path("/auth/**").uri("lb://msauth"))
				.route(r -> r.path("/cart/**").uri("lb://mscart"))
				.route(r -> r.path("/delivery/**").uri("lb://msdelivery"))
				.route(r -> r.path("/payment/**").uri("lb://mspayment"))
				.build();
	}

}
