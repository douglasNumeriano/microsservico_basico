package com.numeriano.serverdiscorevy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerDiscorevyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDiscorevyApplication.class, args);
	}

}
