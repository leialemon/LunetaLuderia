package tech.ada.luderiaAluguel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LuderiaAluguelApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuderiaAluguelApplication.class, args);
	}

}
