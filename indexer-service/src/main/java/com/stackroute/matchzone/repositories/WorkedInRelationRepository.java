package com.stackroute.matchzone.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.relationships.WorkedInRelation;


public interface WorkedInRelationRepository extends Neo4jRepository<WorkedInRelation, String> {

}
