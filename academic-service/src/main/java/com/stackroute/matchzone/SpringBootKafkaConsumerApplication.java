package com.stackroute.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootKafkaConsumerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
	}
}
