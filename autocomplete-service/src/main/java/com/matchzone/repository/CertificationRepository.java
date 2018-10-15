package com.matchzone.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.matchzone.model.Certification;

public interface CertificationRepository extends Neo4jRepository<Certification, String>{

}
