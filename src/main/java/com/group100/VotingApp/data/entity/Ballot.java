package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.group100.VotingApp.enums.CandidateName;
import com.group100.VotingApp.enums.CandidateOffice;

@Entity
public class Ballot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ballotId;
	@ManyToOne
	private User user;

	@Enumerated(EnumType.STRING)
	private CandidateName candidateName;
	@Enumerated(EnumType.STRING)
	private CandidateOffice candidateOffice;

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

	public CandidateOffice getCandidateOffice() {
		return candidateOffice;
	}

	public void setCandidateOffice(CandidateOffice candidateOffice) {
		this.candidateOffice = candidateOffice;
	}

}
