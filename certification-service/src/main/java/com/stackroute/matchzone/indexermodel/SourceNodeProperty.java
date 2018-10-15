package com.stackroute.matchzone.indexermodel;

public class SourceNodeProperty {

	private String certificationName;

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	
	public SourceNodeProperty(String certificationName) {
		super();
		this.certificationName = certificationName;
	}
	@Override
	public String toString() {
		return "SourceNodeProperty [certificationName=" + certificationName + "]";
	}

	
}
