package com.stackroute.matchzone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Certification {

	@Id
	private String userName;
	private String certificationName;
	private String certificationAuthority;
	private String licenseNumber;
	private Integer durationFrom;
	private Integer durationTo;
	private String certificationURL;

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

	public Integer getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(Integer durationFrom) {
		this.durationFrom = durationFrom;
	}

	public Integer getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(Integer durationTo) {
		this.durationTo = durationTo;
	}

	public String getCertificationURL() {
		return certificationURL;
	}

	public void setCertificationURL(String certificationURL) {
		this.certificationURL = certificationURL;
	}

	public Certification(String userName, String certificationName, String certificationAuthority, String licenseNumber,
			Integer durationFrom, Integer durationTo, String certificationURL) {
		super();
		this.userName = userName;
		this.certificationName = certificationName;
		this.certificationAuthority = certificationAuthority;
		this.licenseNumber = licenseNumber;
		this.durationFrom = durationFrom;
		this.durationTo = durationTo;
		this.certificationURL = certificationURL;
	}

	public Certification() {
		super();
	}

}
