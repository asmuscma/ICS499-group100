package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GovNames {
	LAURA("Laura"), JENNIFER("Jennifer");

	@JsonProperty
	private String name;

	private GovNames(String name) {
		this.name = name;
	}

	@JsonValue
	public String getName() {
		return name;
	}

}