package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.group100.VotingApp.enums.CandidateName;

@Entity
public class Ballot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ballotId;
	@ManyToOne
	private User user;

	private String office;
	@Enumerated(EnumType.STRING)
	private CandidateName candidateName;

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

	public CandidateName getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(CandidateName candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateOffice() {
		return office;
	}

	public void setCandidateOffice(String candidateOffice) {
		this.office = candidateOffice;
	}

}
