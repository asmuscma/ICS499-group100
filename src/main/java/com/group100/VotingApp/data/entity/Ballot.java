package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ballot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ballotId;
	@ManyToOne
	private User user;
	@OneToOne
	private Candidate candidate;

	public Ballot() {

	}

	public Ballot(Candidate candidate) {
		this.candidate = candidate;
	}

	public long getBallotId() {
		return ballotId;
	}

	public void setBallotId(long ballotId) {
		this.ballotId = ballotId;
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
