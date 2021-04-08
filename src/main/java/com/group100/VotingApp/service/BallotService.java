package com.group100.VotingApp.service;

import java.util.Map;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;

public interface BallotService {
	public boolean checkIfVoted(User user);
	public Map<Candidate, Long> getResult(String office, String state);
}
