package com.group100.VotingApp.enums;

public enum GovNames {
	laura_T("Alex"), JENNIFER_J("Felix");
	private String name;

	private GovNames(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}