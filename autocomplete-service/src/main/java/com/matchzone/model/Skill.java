package com.matchzone.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Skill {

		 @Id 
		 private String skillName;

		public String getName() {
			return skillName;
		}
		public void setName(String name) {
			this.skillName = name;
		}

		public Skill( String name) {
			super();
			this.skillName = name;
			
		}
		
	}