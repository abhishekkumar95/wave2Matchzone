/*package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.nodes.Company;
import com.stackroute.matchzone.nodes.ProfileId;

@RelationshipEntity(type = "employeeOf")
public class EmployeeOfRelation {
	@Id
	private String role;
	private String duration;
	@StartNode
	private ProfileId profileId;
	@EndNode
	private Company company;

	public EmployeeOfRelation() {
		super();
	}

	public EmployeeOfRelation(String role, String duration, ProfileId profileId, Company company) {
		super();
		this.role = role;
		this.duration = duration;
		this.profileId = profileId;
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public ProfileId getProfileId() {
		return profileId;
	}

	public void setProfileId(ProfileId profileId) {
		this.profileId = profileId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "EmployeeOfRelation [role=" + role + ", duration=" + duration + ", profileId=" + profileId + ", company="
				+ company + "]";
	}

}
*/