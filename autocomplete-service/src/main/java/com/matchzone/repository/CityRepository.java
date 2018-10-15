package com.matchzone.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.matchzone.model.City;

public interface CityRepository extends Neo4jRepository<City, String>{

}
