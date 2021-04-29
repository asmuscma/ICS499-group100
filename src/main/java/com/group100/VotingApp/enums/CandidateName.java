package com.group100.VotingApp.enums;

public enum CandidateName {
	JOHN("John"), JANE("Jane"), ADAM("Adam");

	private String name;

	private CandidateName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}