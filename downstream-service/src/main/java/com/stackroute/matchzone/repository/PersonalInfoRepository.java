package com.stackroute.matchzone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.matchzone.model.PersonalInfo;

@Repository
public interface PersonalInfoRepository extends MongoRepository<PersonalInfo, String>{

}
