package com.stackroute.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchzone.model.Project;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String>{

}
