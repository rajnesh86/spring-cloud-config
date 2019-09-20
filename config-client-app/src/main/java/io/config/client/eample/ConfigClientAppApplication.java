package io.config.client.eample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClientAppApplication {

	@Value("${envType}")
	private String envType;
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppApplication.class, args);
	}
	@RequestMapping
	public String printConfig() {
		return envType;

	}
}
