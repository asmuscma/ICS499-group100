package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.group100.VotingApp.enums.CandidateEnum;

@Entity
public class Ballot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ballotId;
	@ManyToOne
	private User user;
	private CandidateEnum candidate;
	
	
	public Ballot() {

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

	public CandidateEnum getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateEnum candidate) {
		this.candidate = candidate;
	}




}
