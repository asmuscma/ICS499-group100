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
import com.group100.VotingApp.enums.GovNames;
import com.group100.VotingApp.enums.SenatorCandNames;
import com.group100.VotingApp.enums.SenatorCandNames2;

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
	private GovNames govName;
	@Enumerated(EnumType.STRING)
	private SenatorCandNames senName1;
	@Enumerated(EnumType.STRING)
	private SenatorCandNames2 senName2;
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

	public GovNames getGovName() {
		return govName;
	}

	public void setGovName(GovNames govName) {
		this.govName = govName;
	}

	public SenatorCandNames getSen1Name() {
		return senName1;
	}

	public void setSen1Name(SenatorCandNames senName1) {
		this.senName1 = senName1;
	}

	public SenatorCandNames2 getSen2Name() {
		return senName2;
	}

	public void setSen2Name(SenatorCandNames2 senName2) {
		this.senName2 = senName2;
	}

	public CandidateOffice getCandidateOffice() {
		return candidateOffice;
	}

	public void setCandidateOffice(CandidateOffice candidateOffice) {
		this.candidateOffice = candidateOffice;
	}

}
