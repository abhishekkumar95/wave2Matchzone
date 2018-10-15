package com.stackroute.matchzone.model;

public class Certification {

	private String userName;
	private String certificationName;
	private String certificationAuthority;
	private String licenseNumber;
	private String durationFrom;
	private String durationTo;
	private String certificationURL;

	public Certification() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationAuthority() {
		return certificationAuthority;
	}

	public void setCertificationAuthority(String certificationAuthority) {
		this.certificationAuthority = certificationAuthority;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(String durationFrom) {
		this.durationFrom = durationFrom;
	}

	public String getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(String durationTo) {
		this.durationTo = durationTo;
	}

	public String getCertificationURL() {
		return certificationURL;
	}

	public void setCertificationURL(String certificationURL) {
		this.certificationURL = certificationURL;
	}

	public Certification(String userName, String certificationName, String certificationAuthority, String licenseNumber,
			String durationFrom, String durationTo, String certificationURL) {
		super();
		this.userName = userName;
		this.certificationName = certificationName;
		this.certificationAuthority = certificationAuthority;
		this.licenseNumber = licenseNumber;
		this.durationFrom = durationFrom;
		this.durationTo = durationTo;
		this.certificationURL = certificationURL;
	}

	@Override
	public String toString() {
		return "Certification [userName=" + userName + ", certificationName=" + certificationName
				+ ", certificationAuthority=" + certificationAuthority + ", licenseNumber=" + licenseNumber
				+ ", durationFrom=" + durationFrom + ", durationTo=" + durationTo + ", certificationURL="
				+ certificationURL + "]";
	}

}