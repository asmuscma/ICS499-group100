package com.group100.VotingApp.service;

public interface BallotService {
	public boolean checkIfVoted(String username);
	public long getResult(String office);
}
