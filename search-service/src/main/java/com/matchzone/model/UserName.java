package com.matchzone.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.QueryResult;



@NodeEntity


public class UserName {
    @Id
	private String userName;
	
	public UserName() {}

	public UserName(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
