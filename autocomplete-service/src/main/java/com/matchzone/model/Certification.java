package com.matchzone.model;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Certification {
	@Id
	private String certificateName;
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	public Certification(String certificateName) {
		super();
	
		this.certificateName = certificateName;
		
	}
	

}
