package tech.ada.luderiaJogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LuderiaJogosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuderiaJogosApplication.class, args);
	}

}
