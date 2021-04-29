package com.group100.VotingApp.enums;

public enum GovNames {
	LAURA("Laura"), JENNIFER("Jennifer");

	private String name;

	private GovNames(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}