package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BALLOT")
public class Ballot extends Poll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private long userId;
	@Id
	@Column(name = "CANDIDATE_ID")
	private long candidateId;
	@Column(name = "OFFICE")
	private String office;

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
