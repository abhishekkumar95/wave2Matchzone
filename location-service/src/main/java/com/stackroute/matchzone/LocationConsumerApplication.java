package com.stackroute.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="com.stackroute.*")
public class LocationConsumerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(LocationConsumerApplication.class, args);
	}
}
