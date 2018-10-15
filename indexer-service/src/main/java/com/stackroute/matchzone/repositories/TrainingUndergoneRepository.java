package com.stackroute.matchzone.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.relationships.TrainingUndergone;

public interface TrainingUndergoneRepository extends Neo4jRepository<TrainingUndergone, String>{

}
