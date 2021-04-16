package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;

@Entity
public class Candidate extends Person {
	private String party;
	private String office;
	private String state;
	
	public Candidate() {
		
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
