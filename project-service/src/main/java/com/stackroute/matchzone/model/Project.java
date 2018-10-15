package com.stackroute.matchzone.model;

public class Project {

	private String userName;
	private String projectTitle;
	private String client;
	private String projectStatus;
	private String duration;
	private String projectDetails;
	private String projectMembers;
	private String role;
	private String projectLocation;
	private String projectAt;
	private String teamSize;
	private String skills;
	private String projectURL;
	
	public Project(String userName, String projectTitle, String client, String projectStatus, String duration,
			String projectDetails, String projectMembers, String role, String projectLocation, String projectAt,
			String teamSize, String skills, String projectURL) {
		super();
		this.userName = userName;
		this.projectTitle = projectTitle;
		this.client = client;
		this.projectStatus = projectStatus;
		this.duration = duration;
		this.projectDetails = projectDetails;
		this.projectMembers = projectMembers;
		this.role = role;
		this.projectLocation = projectLocation;
		this.projectAt = projectAt;
		this.teamSize = teamSize;
		this.skills = skills;
		this.projectURL = projectURL;
	}

	public Project() {
		super();
	}

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

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	public String getProjectMembers() {
		return projectMembers;
	}

	public void setProjectMembers(String projectMembers) {
		this.projectMembers = projectMembers;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getProjectAt() {
		return projectAt;
	}

	public void setProjectAt(String projectAt) {
		this.projectAt = projectAt;
	}

	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getProjectURL() {
		return projectURL;
	}

	public void setProjectURL(String projectURL) {
		this.projectURL = projectURL;
	}

	@Override
	public String toString() {
		return "Project [userName=" + userName + ", projectTitle=" + projectTitle + ", client=" + client
				+ ", projectStatus=" + projectStatus + ", duration=" + duration + ", projectDetails=" + projectDetails
				+ ", projectMembers=" + projectMembers + ", role=" + role + ", projectLocation=" + projectLocation
				+ ", projectAt=" + projectAt + ", teamSize=" + teamSize + ", skills=" + skills + ", projectURL="
				+ projectURL + "]";
	}

}