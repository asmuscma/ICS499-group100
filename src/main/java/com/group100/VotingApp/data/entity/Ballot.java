package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;

@Entity
public class Ballot extends Poll {
	private long userId;
	private long candidateId;
	private String office;
	public Ballot() {
		
	}
	public Ballot(String question, String answer, long userId, long candidateId, String office) {
		super(question, answer);
		this.userId = userId;
		this.candidateId = candidateId;
		this.office = office;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}
