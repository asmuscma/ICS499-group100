package com.group100.VotingApp.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Candidate")
public class Candidate extends Person {
	@Id
	@Column(name="candidateID")
	private int candidateID;
	@Column(name="party")
	private String party;
	@Column(name="office")
	private String office;

	public Candidate(int candidateID, String fName, String lName, String party, String office) {
		super(fName, lName);
		this.candidateID = candidateID;
		this.party = party;
		this.office = office;
	}

	public int getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
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
