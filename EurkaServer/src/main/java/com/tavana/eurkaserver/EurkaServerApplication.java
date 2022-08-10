package com.tavana.eurkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @autor mohammad saeid tavana
 */
@SpringBootApplication
@EnableEurekaServer
public class EurkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkaServerApplication.class, args);
	}

}
