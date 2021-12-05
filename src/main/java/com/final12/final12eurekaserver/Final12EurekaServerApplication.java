package com.final12.final12eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Final12EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Final12EurekaServerApplication.class, args);
	}

}
