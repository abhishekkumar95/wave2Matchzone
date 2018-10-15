package com.matchzone.model;

import java.util.List;

//Model class for Result with various fields

public class Result {

    private String profileId;
    private List<String> skills;
    private String location;
    private String extra;
    private String organization;
    private String certification;
	private String college;
	private String projects;
	
    
    public Result() {
		super();
	}


	public Result(String profileId, List<String> skills, String location, String extra, String organization,
			String certification, String college, String projects) {
		super();
		this.profileId = profileId;
		this.skills = skills;
		this.location = location;
		this.extra = extra;
		this.organization = organization;
		this.certification = certification;
		this.college = college;
		this.projects = projects;
	}


	public String getProfileId() {
		return profileId;
	}


	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}


	public List<String> getSkills() {
		return skills;
	}


	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getExtra() {
		return extra;
	}


	public void setExtra(String extra) {
		this.extra = extra;
	}


	public String getOrganization() {
		return organization;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public String getCertification() {
		return certification;
	}


	public void setCertification(String certification) {
		this.certification = certification;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getProjects() {
		return projects;
	}


	public void setProjects(String projects) {
		this.projects = projects;
	}


	@Override
	public String toString() {
		return "Result [profileId=" + profileId + ", skills=" + skills + ", location=" + location + ", extra=" + extra
				+ ", organization=" + organization + ", certification=" + certification + ", college=" + college
				+ ", projects=" + projects + "]";
	}
}
