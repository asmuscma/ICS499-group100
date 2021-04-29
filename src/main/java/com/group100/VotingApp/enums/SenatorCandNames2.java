package com.group100.VotingApp.enums;

public enum SenatorCandNames2 {
	JORGE("Jorge"), SAMSON("Samson");

	private String name;

	private SenatorCandNames2(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}