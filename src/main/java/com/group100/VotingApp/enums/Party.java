package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Party {
	
	DEMOCRAT("democrat"),
	REPUBLICAN("republican");
	
	private String party;
	
	Party(String party) {
		this.party = party;
	}
	
		
	@JsonValue
	public String getParty() {
		return party;
	}

}
