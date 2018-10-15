package com.matchzone.model;

import java.util.List;

//Model class for Search with various fields

public class Search {

	private List<String> skills;
	private List<String> location;
	private List<String> experience;
	private List<String> organization;
	private List<String> certification;
	private List<String> college;
	private List<String> projects;

	public Search() {

		super();
	}

	public Search(List<String> skills, List<String> location, List<String> experience, List<String> organization,
			List<String> certification, List<String> college, List<String> projects) {
		super();
		this.skills = skills;
		this.location = location;
		this.experience = experience;
		this.organization = organization;
		this.certification = certification;
		this.college = college;
		this.projects = projects;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	public List<String> getExperience() {
		return experience;
	}

	public void setExperience(List<String> experience) {
		this.experience = experience;
	}

	public List<String> getOrganization() {
		return organization;
	}

	public void setOrganization(List<String> organization) {
		this.organization = organization;
	}

	public List<String> getCertification() {
		return certification;
	}

	public void setCertification(List<String> certification) {
		this.certification = certification;
	}

	public List<String> getCollege() {
		return college;
	}

	public void setCollege(List<String> college) {
		this.college = college;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Search [skills=" + skills + ", location=" + location + ", experience=" + experience + ", organization="
				+ organization + ", certification=" + certification + ", college=" + college + ", projects=" + projects
				+ "]";
	}

}
