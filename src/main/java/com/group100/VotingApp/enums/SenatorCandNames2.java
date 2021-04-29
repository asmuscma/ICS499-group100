package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SenatorCandNames2 {
	JORGE("Jorge"), SAMSON("Samson");

	@JsonProperty
	private String name;

	private SenatorCandNames2(String name) {
		this.name = name;
	}

	@JsonValue
	public String getName() {
		return name;
	}

}