package com.group100.VotingApp.data.entity;

public class Ballot {
	private int userID;
	private Race;
	private String Office;
	public Ballot(int userID, int candidateID, String office) {
		super();
		this.userID = userID;
		this.candidateID = candidateID;
		Office = office;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}
	public String getOffice() {
		return Office;
	}
	public void setOffice(String office) {
		Office = office;
	}
	

}
