package com.stackroute.matchzone.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class UserName {
	@Id
	private String userName;

	public UserName() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserName(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserName [userName=" + userName + "]";
	}

	

	
}
