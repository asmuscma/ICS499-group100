package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Ballot extends Poll {
	@OneToOne
	private User user;
	@OneToOne
	private Candidate candidate;

	public Ballot() {

	}

	public Ballot(String question, String answer) {
		super(question, answer);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
}
