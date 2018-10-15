package com.stackroute.matchzone.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.stackroute.matchzone.nodes.City;
import com.stackroute.matchzone.nodes.UserName;

@RelationshipEntity(type = "livedIn")
public class LivedInRelation {
	@Id
	private String locationProfileId;
	@StartNode
	private UserName profileId;
	@EndNode
	private City city;

	public LivedInRelation() {
		super();
		
	}

	public LivedInRelation(String locationProfileId, UserName profileId, City city) {
		super();
		this.locationProfileId = locationProfileId;
		this.profileId = profileId;
		this.city = city;
	}

	public String getLocationProfileId() {
		return locationProfileId;
	}

	public void setLocationProfileId(String locationProfileId) {
		this.locationProfileId = locationProfileId;
	}

	public UserName getProfileId() {
		return profileId;
	}

	public void setProfileId(UserName profileId) {
		this.profileId = profileId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "LivedInRelation [locationProfileId=" + locationProfileId + ", profileId=" + profileId + ", city=" + city
				+ "]";
	}

}
