package com.stackroute.matchzone.indexermodel;

public class ProjectIndex {
	private String projectTitle;
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public ProjectIndex( String projectTitle,String userName) {
		super();
		this.userName = userName;
		this.projectTitle = projectTitle;
	}
	public ProjectIndex() {
		super();
	}
	@Override
	public String toString() {
		return "ProjectIndex [projectTitle=" + projectTitle + ", userName=" + userName + "]";
	}
	
	
		
}
