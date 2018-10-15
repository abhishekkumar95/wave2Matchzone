package com.stackroute.matchzone.model;

public class Academic {

	private String education;
	private String course;
	private String specialisation;
	private String universityInstitute;
	private String passingYear;
	private String gradingSystem;
	private String higherSecondary;
	private String highDuration;
	private String highLocation;
	private String seniorSecondary;
	private String senDuration;
	private String senLocation;
	private String userName;
	public String getEducation() {
		return education;
	}
	
	public Academic() {
		super();
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
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
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
	public String getHighDuration() {
		return highDuration;
	}
	public void setHighDuration(String highDuration) {
		this.highDuration = highDuration;
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
	public String getSenDuration() {
		return senDuration;
	}
	public void setSenDuration(String senDuration) {
		this.senDuration = senDuration;
	}
	public String getSenLocation() {
		return senLocation;
	}
	public void setSenLocation(String senLocation) {
		this.senLocation = senLocation;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Academic(String education, String course, String specialisation, String universityInstitute,
			String passingYear, String gradingSystem, String higherSecondary, String highDuration, String highLocation,
			String seniorSecondary, String senDuration, String senLocation, String userName) {
		super();
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
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Academic [education=" + education + ", course=" + course + ", specialisation=" + specialisation
				+ ", universityInstitute=" + universityInstitute + ", passingYear=" + passingYear + ", gradingSystem="
				+ gradingSystem + ", higherSecondary=" + higherSecondary + ", highDuration=" + highDuration
				+ ", highLocation=" + highLocation + ", seniorSecondary=" + seniorSecondary + ", senDuration="
				+ senDuration + ", senLocation=" + senLocation + ", userName=" + userName + "]";
	}

	
    
}