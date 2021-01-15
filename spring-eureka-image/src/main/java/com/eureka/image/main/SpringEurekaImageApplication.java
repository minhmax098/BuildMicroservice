package com.eureka.image.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaImageApplication.class, args);
	}

}
