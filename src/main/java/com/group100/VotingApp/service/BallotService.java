package com.group100.VotingApp.service;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;

public interface BallotService {
	boolean checkIfVoted(User user);
	Candidate getResult(String office);
}
