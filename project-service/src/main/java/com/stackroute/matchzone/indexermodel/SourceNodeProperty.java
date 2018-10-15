package com.stackroute.matchzone.indexermodel;

public class SourceNodeProperty {

	private String projectTitle;
	
	



	public SourceNodeProperty(String projectTitle) {
		super();
		this.projectTitle = projectTitle;
	}



	public String getProjectTitle() {
		return projectTitle;
	}



	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}



	public SourceNodeProperty() {
		super();
	}

	
	@Override
	public String toString() {
		return "SourceNodeProperty [projectTitle=" + projectTitle + "]";
	}


	
}
