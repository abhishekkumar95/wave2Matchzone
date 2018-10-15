package com.matchzone.model;

import java.util.List;

public class Search {

	private List<String> skills;
	private List<String> location;
	private List<String> experience;
	private List<String> organization;

	public Search() {

		super();
	}

	public Search(List<String> skills, List<String> location, List<String> experience, List<String> organization) {
		super();
		this.skills = skills;
		this.location = location;
		this.experience = experience;
		this.organization = organization;
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

	@Override
	public String toString() {
		return "Search [skills=" + skills + ", location=" + location + ", experience=" + experience + ", organization="
				+ organization + "]";
	}

}
