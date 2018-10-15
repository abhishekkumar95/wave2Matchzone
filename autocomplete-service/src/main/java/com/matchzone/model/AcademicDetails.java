package com.matchzone.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class AcademicDetails {
	
	@Id
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public AcademicDetails(String courseName) {
		super();
		this.courseName = courseName;
	}
	
}
