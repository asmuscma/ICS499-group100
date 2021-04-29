package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SenatorCandNames {
	ALEX("Alex"), FELIX("Felix");

	@JsonProperty
	private String name;

	private SenatorCandNames(String name) {
		this.name = name;
	}

	@JsonValue
	public String getName() {
		return name;
	}

}