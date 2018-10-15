package com.stackroute.matchzone.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.matchzone.relationships.StudiedAtRelation;



public interface StudiedAtRelationRepository extends Neo4jRepository<StudiedAtRelation, String>{

}
