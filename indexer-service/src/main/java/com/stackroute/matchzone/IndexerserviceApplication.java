package com.stackroute.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;


@EnableDiscoveryClient
@SpringBootApplication
@EnableNeo4jRepositories
public class IndexerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndexerserviceApplication.class, args);
	}
}
