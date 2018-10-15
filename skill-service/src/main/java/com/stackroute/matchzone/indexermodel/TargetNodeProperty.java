package com.stackroute.matchzone.indexermodel;

public class TargetNodeProperty {

	private String userName;

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public TargetNodeProperty() {
		super();
	}

	public TargetNodeProperty(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TargetNodeProperty [profileId=" + userName + "]";
	}
}
