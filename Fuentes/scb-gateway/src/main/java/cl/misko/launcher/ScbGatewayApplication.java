package cl.misko.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * launcher
 * 
 * @author camilongo
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ScbGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScbGatewayApplication.class, args);
	}

}
