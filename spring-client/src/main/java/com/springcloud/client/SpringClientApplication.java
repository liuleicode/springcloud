package com.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientApplication.class, args);
	}
}
