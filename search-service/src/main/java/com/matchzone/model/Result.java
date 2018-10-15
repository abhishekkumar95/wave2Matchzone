package com.matchzone.model;

import java.util.List;

import org.springframework.data.neo4j.annotation.QueryResult;
@QueryResult
public class Result {

	private String userName;
	private String skills;
	private String location;
	private String extra;
	private String organization;

	public Result() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
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



	@Override
	public String toString() {
		return "Result [userName=" + userName + ", skills=" + skills + ", location=" + location + ", extra=" + extra
				+ ", organization=" + organization + "]";
	}

	public Result(String userName, String skills, String location, String extra, String organization) {
		super();
		this.userName = userName;
		this.skills = skills;
		this.location = location;
		this.extra = extra;
		this.organization = organization;
	}
	
	
	
}
