package com.stackroute.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchzone.model.Academic;

@Repository
public interface AcademicDetailsRepository extends MongoRepository<Academic, String>{

}
