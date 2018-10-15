package com.matchzone.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Project {

		@Id
		private String projectName;
		
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		
		public Project( String projectName) {
			super();
			this.projectName = projectName;

		}
}		