package com.group100.VotingApp.service;

import com.group100.VotingApp.data.entity.Candidate;

public interface BallotService {
	boolean checkIfVoted(String username);
	Candidate getResult(String office);
}
