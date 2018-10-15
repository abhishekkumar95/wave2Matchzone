package com.stackroute.matchzone.indexermodel;

public class Indexer {

	private String sourceNodeType;
	private SourceNodeProperties sourceNodeProperties;
	private String targetNodeType;
	private TargetNodeProperties targetNodeProperties;
	private String relationshipName;
   
    
	public Indexer() {
		super();
	}


	public Indexer(String sourceNodeType, SourceNodeProperties sourceNodeProperties, String targetNodeType,
			TargetNodeProperties targetNodeProperties, String relationshipName) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperties = sourceNodeProperties;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperties = targetNodeProperties;
		this.relationshipName = relationshipName;
	
	}



	public String getSourceNodeType() {
		return sourceNodeType;
	}

	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
	}

	public SourceNodeProperties getSourceNodeProperties() {
		return sourceNodeProperties;
	}

	public void setSourceNodeProperties(SourceNodeProperties sourceNodeProperties) {
		this.sourceNodeProperties = sourceNodeProperties;
	}

	public String getTargetNodeType() {
		return targetNodeType;
	}

	public void setTargetNodeType(String targetNodeType) {
		this.targetNodeType = targetNodeType;
	}

	public TargetNodeProperties getTargetNodeProperties() {
		return targetNodeProperties;
	}

	public void setTargetNodeProperties(TargetNodeProperties targetNodeProperties) {
		this.targetNodeProperties = targetNodeProperties;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

	@Override
	public String toString() {
		return "{ sourceNodeType : " + sourceNodeType + ", sourceNodeProperties : " + sourceNodeProperties
				+ ", targetNodeType : " + targetNodeType + ", targetNodeProperties : " + targetNodeProperties
				+ ", relationshipName : " + relationshipName + " }";

	}

}
