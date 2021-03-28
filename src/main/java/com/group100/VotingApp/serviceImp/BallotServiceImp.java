package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.service.BallotService;

public class BallotServiceImp implements BallotService {
	
	@Override
	public Candidate getBallotResult(String office) {
		return null;
	}
	
	public boolean checkIfVoted(User user, String office) {
		return false;
	}
}
