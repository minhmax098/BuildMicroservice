package com.eureka.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// Khai báo đây là một Eureka Server bằng một annotation @EnableRurekaServer
@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServer2Application.class, args);
	}

}
