package com.stackroute.matchzone.indexermodel;

public class TargetNodeProperties {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public TargetNodeProperties(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TargetNodeProperties [userName=" + userName + "]";
	}

	public TargetNodeProperties() {
		super();
	}

	
	
}
