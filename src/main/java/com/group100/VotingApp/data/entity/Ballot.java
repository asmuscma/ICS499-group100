package com.group100.VotingApp.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Ballot")
public class Ballot {
	@Id
	@Column(name="userID")
	private int userID;
	@Column(name="Race")
	private race Race;
	@Column(name="office")
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
