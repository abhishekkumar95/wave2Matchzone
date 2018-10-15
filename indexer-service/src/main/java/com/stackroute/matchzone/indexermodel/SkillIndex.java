package com.stackroute.matchzone.indexermodel;

public class SkillIndex {

	private String userName;
	private String iTSkills;
	public SkillIndex(String userName, String iTSkills) {
		super();
		this.userName = userName;
		this.iTSkills = iTSkills;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getiTSkills() {
		return iTSkills;
	}
	public void setiTSkills(String iTSkills) {
		this.iTSkills = iTSkills;
	}
	public SkillIndex() {
		super();
	}
	@Override
	public String toString() {
		return "SkillIndex [userName=" + userName + ", iTSkills=" + iTSkills + "]";
	}
	
}
