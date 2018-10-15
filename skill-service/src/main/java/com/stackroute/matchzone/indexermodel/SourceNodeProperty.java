package com.stackroute.matchzone.indexermodel;

public class SourceNodeProperty {

	private String iTSkill;

	public SourceNodeProperty(String iTSkill) {
		super();
		this.iTSkill = iTSkill;
	}

	public String getiTSkill() {
		return iTSkill;
	}

	public void setiTSkill(String iTSkill) {
		this.iTSkill = iTSkill;
	}

	public SourceNodeProperty() {
		super();
	}

	@Override
	public String toString() {
		return "SourceNodeProperty [iTSkill=" + iTSkill + "]";
	}
	
	
}
