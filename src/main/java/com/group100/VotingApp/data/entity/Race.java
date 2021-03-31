package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Race {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long raceId;
	@ManyToOne
	private User user;
	@OneToOne
	private Candidate candidate;

	public Race() {

	}

	public Race(Candidate candidate) {
		this.candidate = candidate;
	}

	public long getRaceId() {
		return raceId;
	}

	public void setRaceId(long raceId) {
		this.raceId = raceId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
}
