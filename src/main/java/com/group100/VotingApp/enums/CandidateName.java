package com.group100.VotingApp.enums;

public enum CandidateName {
	JOHN("John"), JANE("JANE"), ADAM("ADAM");

	private String name;

	private CandidateName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}