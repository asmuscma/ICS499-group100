package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.service.BallotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BallotServiceImp implements BallotService {
	
	@Autowired
	private BallotRepository ballotRepo;

	@Override
	public boolean checkIfVoted(String username) {
		if(ballotRepo.findByUser(username) != null) {
			return true;
		}
		return false;
	}

	@Override
	public long getResult(String office) {
		// TODO Auto-generated method stub
		return 0;
	}
}
