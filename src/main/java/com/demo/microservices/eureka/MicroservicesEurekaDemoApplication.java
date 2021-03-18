package com.demo.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Service.
 * 
 * @author Vijesh Kirodian
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroservicesEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaDemoApplication.class, args);
	}

}
