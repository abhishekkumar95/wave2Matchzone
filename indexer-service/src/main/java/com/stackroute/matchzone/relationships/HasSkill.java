package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.nodes.UserName;
import com.stackroute.matchzone.nodes.Skill;
@RelationshipEntity(type = "hasSkill")
public class HasSkill {
	@Id
	@StartNode
	private UserName userName;
	@EndNode
	private Skill skill;

	public HasSkill() {
		super();
	}

	
	public UserName getUserName() {
		return userName;
	}

	public void setUserName(UserName userName) {
		this.userName = userName;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "HasSkill [  userName=" + userName + ", skill=" + skill + "]";
	}

	public HasSkill( UserName userName, Skill skill) {
		super();
		
		this.userName = userName;
		this.skill = skill;
	}

	

}