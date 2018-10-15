package com.stackroute.matchzone.model;

public class Skills {

	
	private String iTSkills;
	private String version;
	private String level;
	private String lastUsed;
	private String userName;
	//private String message;
	public String getiTSkills() {
		return iTSkills;
	}
	public void setiTSkills(String iTSkills) {
		this.iTSkills = iTSkills;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLastUsed() {
		return lastUsed;
	}
	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Skills(String iTSkills, String version, String level, String lastUsed, String userName) {
		super();
		this.iTSkills = iTSkills;
		this.version = version;
		this.level = level;
		this.lastUsed = lastUsed;
		this.userName = userName;
	}
	public Skills() {
		super();
	}
	@Override
	public String toString() {
		return "Skills [iTSkills=" + iTSkills + ", version=" + version + ", level=" + level + ", lastUsed=" + lastUsed
				+ ", userName=" + userName + "]";
	}

    
	

}