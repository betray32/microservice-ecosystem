package cl.misko.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * launcher
 * 
 * @author camilongo
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ScbDiscoverEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScbDiscoverEurekaApplication.class, args);
	}

}
