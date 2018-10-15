package com.stackroute.matchzone.indexermodel;

public class TargetNodeProperty {

	private String userName;

	

	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public TargetNodeProperty(String userName) {
		super();
		this.userName = userName;
	}



	public TargetNodeProperty() {
		super();
	}



	@Override
	public String toString() {
		return "TargetNodeProperty [userName=" + userName + "]";
	}

	
}
