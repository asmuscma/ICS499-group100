package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Ballot extends Poll {
	@OneToOne
	private User user;
	private long candidateId;
	private String office;

	public Ballot() {

	}

	public Ballot(String question, String answer, long candidateId, String office) {
		super(question, answer);
		this.candidateId = candidateId;
		this.office = office;
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
