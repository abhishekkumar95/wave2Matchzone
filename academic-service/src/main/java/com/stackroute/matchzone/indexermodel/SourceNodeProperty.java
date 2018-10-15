package com.stackroute.matchzone.indexermodel;

public class SourceNodeProperty {

	private String universityInstitute;

	public String getUniversityInstitute() {
		return universityInstitute;
	}

	public void setUniversityInstitute(String universityInstitute) {
		this.universityInstitute = universityInstitute;
	}

	public SourceNodeProperty(String universityInstitute) {
		super();
		this.universityInstitute = universityInstitute;
	}

	@Override
	public String toString() {
		return "SourceNodeProperty [universityInstitute=" + universityInstitute + "]";
	};


    
    
	
	
}
