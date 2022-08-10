package com.tavana.customer;

import com.tavana.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.ws.rs.core.Application;



/**
 * @autor mohammad saeid tavana
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication implements ApplicationRunner {

	@Autowired
	CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(" application runner");
		String message= customerService.getservice();
		System.out.println(message);
	}
}
