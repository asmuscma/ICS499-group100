package com.group100.VotingApp.data.entity;

public class Candidate {
	private int candidateID;
	private String fName;
	private String lName;
	private String party;
	private String office;
	public Candidate(int candidateID, String fName, String lName, String party, String office) {
		super();
		this.candidateID = candidateID;
		this.fName = fName;
		this.lName = lName;
		this.party = party;
		this.office = office;
	}
	public int getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
