package com.matchzone.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.matchzone.model.UserName;

@Repository
public interface SearchRepository extends Neo4jRepository<UserName, String>{

	@Query("MATCH (u:UserName)-[:KNOWS]->(s:FRONTEND) where s.name IN {list} RETURN u")
	public List<UserName> getBySkill(@Param("list") List<String> list);

	
}
