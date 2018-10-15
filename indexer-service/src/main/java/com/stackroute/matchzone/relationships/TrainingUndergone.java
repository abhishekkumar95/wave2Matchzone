package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.nodes.Certi;
import com.stackroute.matchzone.nodes.UserName;



// this is the pojo class based on which the relationships and their properties in the neo4j  are created upon
@RelationshipEntity(type = "undergone")
public class TrainingUndergone {
	@Id
	
	@StartNode
	private UserName userName;
	@EndNode
	private Certi certi;

	public TrainingUndergone() {
		super();
	}

	public TrainingUndergone(UserName userName, Certi certi) {
		super();
		this.userName = userName;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "TrainingUndergone [userName=" + userName + ", certi=" + certi + "]";
	}

	

}
