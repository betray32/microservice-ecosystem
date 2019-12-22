package cl.misko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ScbZuulGatewayApplication
 * 
 * @author camilongo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ScbZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScbZuulGatewayApplication.class, args);
	}

}
