package com.group100.VotingApp.enums;

public enum SenatorCandNames {
	ALEX("Alex"), FELIX("Felix");

	private String name;

	private SenatorCandNames(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}