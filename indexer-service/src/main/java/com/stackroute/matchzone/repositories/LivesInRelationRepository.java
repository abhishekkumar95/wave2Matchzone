package com.stackroute.matchzone.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.relationships.LivesInRelation;

public interface LivesInRelationRepository extends Neo4jRepository<LivesInRelation, String> {

}
