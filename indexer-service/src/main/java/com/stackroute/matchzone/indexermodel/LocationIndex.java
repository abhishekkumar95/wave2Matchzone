package com.stackroute.matchzone.indexermodel;

public class LocationIndex {
   
   private String userName;
   private String city;
   
	public LocationIndex() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "LocationIndex [userName=" + userName + ", city=" + city + "]";
	}

	public LocationIndex(String userName, String city) {
		super();
		this.userName = userName;
		this.city = city;
	}


}
