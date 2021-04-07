package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.service.BallotService;

import org.springframework.stereotype.Service;

@Service
public class BallotServiceImp implements BallotService {
	
	private BallotRepository ballotRepo;

	@Override
	public boolean checkIfVoted(String username) {
		if(ballotRepo.findByUsername(username) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Candidate getResult(String office) {
		// TODO Auto-generated method stub
		return null;
	}

}
