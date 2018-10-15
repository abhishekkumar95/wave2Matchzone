package com.matchzone.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.matchzone.model.Project;

public interface ProjectRepository extends Neo4jRepository<Project,String>{

}
