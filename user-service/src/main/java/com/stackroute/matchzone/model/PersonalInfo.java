package com.stackroute.matchzone.model;

import java.util.Date;

public class PersonalInfo {

	private String userName;
	private String userId;
	private Date dateOfBirth;
	private String gender;
	private String maritalStatus;
	private String permanentAddress;
	private String homeTown;
	private Integer pinCode;
	private String languages;
	private Integer age;
	private String bloodGroup;
	private String linkedinUrl;
	private String emailId;
	private String gitHubUrl;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGitHubUrl() {
		return gitHubUrl;
	}

	public void setGitHubUrl(String gitHubUrl) {
		this.gitHubUrl = gitHubUrl;
	}

	public PersonalInfo(String userId, String userName, Date dateOfBirth, String gender, String maritalStatus,
			String permanentAddress, String homeTown, Integer pinCode, String languages, Integer age, String bloodGroup,
			String linkedinUrl, String emailId, String gitHubUrl) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.permanentAddress = permanentAddress;
		this.homeTown = homeTown;
		this.pinCode = pinCode;
		this.languages = languages;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.linkedinUrl = linkedinUrl;
		this.emailId = emailId;
		this.gitHubUrl = gitHubUrl;
	}

	public PersonalInfo() {
		super();
	}

}
