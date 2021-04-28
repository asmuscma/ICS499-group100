package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Opinion {
	YES("Yes"),
	NO("No");
	
	private String opinion;
	
	private Opinion(String opinion) {
		this.opinion = opinion;
	}
	
	@JsonValue
	public String getOpinion() {
		return opinion;
	}
}
