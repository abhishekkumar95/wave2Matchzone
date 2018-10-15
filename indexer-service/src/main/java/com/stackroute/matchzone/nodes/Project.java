package com.stackroute.matchzone.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
@NodeEntity
public class Project {
	
	@Id
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project(String name) {
		super();
		this.name = name;
	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [name=" + name + "]";
	}
	

}
