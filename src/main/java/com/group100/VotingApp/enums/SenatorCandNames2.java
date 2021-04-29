package com.group100.VotingApp.enums;

public enum SenatorCandNames2 {
	JORGE_T("Alex"), SAMSON_J("Felix");
	private String name;

	private SenatorCandNames2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}