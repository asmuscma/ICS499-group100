package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATE")
public class Candidate extends Person {
	@Column(name = "PARTY")
	private String party;
	@Column(name = "OFFICE")
	private String office;
	
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

}
