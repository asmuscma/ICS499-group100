package com.group100.VotingApp.enums;

public enum SenatorCandNames {
	ALEX_T("Alex"), FELIX_J("Felix");
	private String name;

	private SenatorCandNames(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}