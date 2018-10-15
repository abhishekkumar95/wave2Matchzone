package com.stackroute.matchzone.indexermodel;

public class AcademicIndex {
	private String universityInstitute;
	private String userName;
	public String getUniversityInstitute() {
		return universityInstitute;
	}
	public void setUniversityInstitute(String universityInstitute) {
		this.universityInstitute = universityInstitute;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public AcademicIndex(String universityInstitute, String userName) {
		super();
		this.universityInstitute = universityInstitute;
		this.userName = userName;
	}
	public AcademicIndex() {
		super();
	}


	
}	
	
	
	
	
