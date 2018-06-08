package com.demo.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistrationService {

	public static void main(String[] args) {
		//System.setProperty("eureka.instance.environment", "prod");
		SpringApplication.run(RegistrationService.class, args);
	}
}
