package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.nodes.City;
import com.stackroute.matchzone.nodes.UserName;

@RelationshipEntity(type = "livesIn")
public class LivesInRelation {
	@Id
	
	@StartNode
	private UserName userName;
	@EndNode
	private City city;

	public LivesInRelation() {
		super();
	}

	public UserName getUserName() {
		return userName;
	}

	public void setUserName(UserName userName) {
		this.userName = userName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public LivesInRelation(UserName userName, City city) {
		super();
		this.userName = userName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "LivesInRelation [userName=" + userName + ", city=" + city + "]";
	}


}
