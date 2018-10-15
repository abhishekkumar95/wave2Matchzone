package com.stackroute.matchzone.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.relationships.LivedInRelation;

public interface LivedInRelationRepository extends Neo4jRepository<LivedInRelation, String>{

}
