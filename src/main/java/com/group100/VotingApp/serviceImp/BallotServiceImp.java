package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.service.BallotService;

import org.springframework.stereotype.Service;

@Service
public class BallotServiceImp implements BallotService {

	@Override
	public boolean checkIfVoted(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Candidate getResult(String office) {
		// TODO Auto-generated method stub
		return null;
	}

}
