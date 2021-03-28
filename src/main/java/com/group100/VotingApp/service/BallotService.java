package com.group100.VotingApp.service;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;

public interface BallotService {
	
	public Candidate getBallotResult(String office);
	public boolean checkIfVoted(User user, String office);
}
