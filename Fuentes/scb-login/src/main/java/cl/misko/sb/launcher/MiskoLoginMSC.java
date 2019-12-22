package cl.misko.sb.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Punto de inicio para la aplicacion
 * 
 * @author ccontrerasc
 *
 */
@EnableDiscoveryClient
@SpringBootApplication

/*
 * Se debe de indicar todos los packages que contiene esta aplicacion
 */
@ComponentScan
(
	{ 
		"cl.misko.sb.bean",
		"cl.misko.sb.delegate",
		"cl.misko.sb.helper",
		"cl.misko.sb.launcher",
		"cl.misko.sb.rest",
		"cl.misko.sb.dao"
	}
)
public class MiskoLoginMSC {

	public static void main(String[] args) {
		SpringApplication.run(MiskoLoginMSC.class, args);
	}

}
