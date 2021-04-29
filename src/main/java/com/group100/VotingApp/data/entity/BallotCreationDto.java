package com.group100.VotingApp.data.entity;

import java.util.List;

public class BallotCreationDto {
	private List<Ballot> ballots;
	
	public BallotCreationDto() {
		
	}
	
	public BallotCreationDto(List<Ballot> ballots) {
		this.ballots = ballots;
	}
	
	public void addBallot(Ballot ballot) {
		this.ballots.add(ballot);
	}

	public List<Ballot> getBallots() {
		return ballots;
	}

	public void setBallots(List<Ballot> ballots) {
		this.ballots = ballots;
	}
}
