package com.stackroute.matchzone.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.stackroute.matchzone.relationships.HasSkill;

public interface HasSkillRepository extends Neo4jRepository<HasSkill, String>{

}
