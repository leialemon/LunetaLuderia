package tech.ada.luderiaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LuderiaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuderiaserverApplication.class, args);
	}

}
