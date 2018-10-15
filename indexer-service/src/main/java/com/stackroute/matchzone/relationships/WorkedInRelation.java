package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;


import com.stackroute.matchzone.nodes.Project;
import com.stackroute.matchzone.nodes.UserName;

// this is the pojo class based on which the relationships and their properties in the neo4j  are created upon
@RelationshipEntity(type = "workedIn")
public class WorkedInRelation {
	@Id
	@StartNode
	private UserName userName;
	@EndNode
	private Project project;

	public WorkedInRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserName getUserName() {
		return userName;
	}

	public void setUserName(UserName userName) {
		this.userName = userName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public WorkedInRelation(UserName userName, Project project) {
		super();
		this.userName = userName;
		this.project = project;
	}

	@Override
	public String toString() {
		return "WorkedInRelation [userName=" + userName + ", project=" + project + "]";
	}

	

}
