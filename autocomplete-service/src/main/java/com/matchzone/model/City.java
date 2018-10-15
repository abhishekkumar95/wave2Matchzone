package com.matchzone.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class City {

	 @Id 	
	private String cityName;

	public String getName() {
		return cityName;
	}
	public void setName(String name) {
		this.cityName = name;
	}

	public City( String name) {
		super();
		this.cityName = name;
	}
	
}


