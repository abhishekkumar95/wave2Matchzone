package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;


import com.stackroute.matchzone.nodes.University;
import com.stackroute.matchzone.nodes.UserName;

@RelationshipEntity(type = "studiedAt")
public class StudiedAtRelation {
	@Id
	
	@StartNode
	private UserName userName;
	@EndNode
	private University university;

	public StudiedAtRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudiedAtRelation(UserName userName, University university) {
		super();
		this.userName = userName;
		this.university = university;
	}

	public UserName getUserName() {
		return userName;
	}

	public void setUserName(UserName userName) {
		this.userName = userName;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "StudiedAtRelation [userName=" + userName + ", university=" + university + "]";
	}




}
