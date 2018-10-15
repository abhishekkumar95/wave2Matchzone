package com.stackroute.matchzone.indexermodel;

public class SourceNodeProperties {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public SourceNodeProperties(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "SourceNodeProperties [city=" + city + "]";
	}

	public SourceNodeProperties() {
		super();
	}

	
}



