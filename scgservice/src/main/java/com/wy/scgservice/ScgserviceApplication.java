package com.wy.scgservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScgserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScgserviceApplication.class, args);
	}

}
