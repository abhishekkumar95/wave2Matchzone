package com.stackroute.matchzone.indexermodel;

public class CertificationIndex {

	private String certificationName;
	private String userName;
	
	

	public String getCertificationName() {
		return certificationName;
	}



	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public CertificationIndex(String certificationName, String userName) {
		super();
		this.certificationName = certificationName;
		this.userName = userName;
	}



	@Override
	public String toString() {
		return "CertificationIndex [certificationName=" + certificationName + ", userName=" + userName + "]";
	}



	public CertificationIndex() {
		super();
	}
	
	

}
