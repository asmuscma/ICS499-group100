package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CandidateName {
	JOHN("John"), JANE("Jane"), ADAM("Adam");

	@JsonProperty
	private String name;

	private CandidateName(String name) {
		this.name = name;
	}

	@JsonValue
	public String getName() {
		return name;
	}

}