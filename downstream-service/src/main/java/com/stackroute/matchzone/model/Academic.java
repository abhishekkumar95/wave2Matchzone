package com.stackroute.matchzone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Academic 
{

	@Id
	private String userName;
	private String education;
	private String course;
	private String specialisation;
	private String universityInstitute;
	private Integer passingYear;
	private String gradingSystem;
	private String higherSecondary;
	private Integer highDuration;
	private String highLocation;
	private String seniorSecondary;
	private Integer senDuration;
	private String senLocation;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public String getUniversityInstitute() {
		return universityInstitute;
	}

	public void setUniversityInstitute(String universityInstitute) {
		this.universityInstitute = universityInstitute;
	}

	public String getGradingSystem() {
		return gradingSystem;
	}

	public void setGradingSystem(String gradingSystem) {
		this.gradingSystem = gradingSystem;
	}

	public String getHigherSecondary() {
		return higherSecondary;
	}

	public void setHigherSecondary(String higherSecondary) {
		this.higherSecondary = higherSecondary;
	}

	public String getHighLocation() {
		return highLocation;
	}

	public void setHighLocation(String highLocation) {
		this.highLocation = highLocation;
	}

	public String getSeniorSecondary() {
		return seniorSecondary;
	}

	public void setSeniorSecondary(String seniorSecondary) {
		this.seniorSecondary = seniorSecondary;
	}

	public Integer getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(Integer passingYear) {
		this.passingYear = passingYear;
	}

	public Integer getHighDuration() {
		return highDuration;
	}

	public void setHighDuration(Integer highDuration) {
		this.highDuration = highDuration;
	}

	public Integer getSenDuration() {
		return senDuration;
	}

	public void setSenDuration(Integer senDuration) {
		this.senDuration = senDuration;
	}

	public String getSenLocation() {
		return senLocation;
	}

	public void setSenLocation(String senLocation) {
		this.senLocation = senLocation;
	}

	public Academic(String userName, String education, String course, String specialisation, String universityInstitute,
			Integer passingYear, String gradingSystem, String higherSecondary, Integer highDuration,
			String highLocation, String seniorSecondary, Integer senDuration, String senLocation) {
		super();
		this.userName = userName;
		this.education = education;
		this.course = course;
		this.specialisation = specialisation;
		this.universityInstitute = universityInstitute;
		this.passingYear = passingYear;
		this.gradingSystem = gradingSystem;
		this.higherSecondary = higherSecondary;
		this.highDuration = highDuration;
		this.highLocation = highLocation;
		this.seniorSecondary = seniorSecondary;
		this.senDuration = senDuration;
		this.senLocation = senLocation;
	}

	public Academic() {
		super();
	}

}
