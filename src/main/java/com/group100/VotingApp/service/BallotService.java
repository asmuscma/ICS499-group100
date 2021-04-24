package com.group100.VotingApp.service;

import java.util.Map;

import com.group100.VotingApp.data.entity.Candidate;

public interface BallotService {
	public boolean checkIfVoted(String username);
	public Map<Candidate, Long> getResult(String office, String state);
}
