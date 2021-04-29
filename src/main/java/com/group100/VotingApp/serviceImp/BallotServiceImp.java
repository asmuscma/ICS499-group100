package com.group100.VotingApp.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.service.BallotService;

@Service
public class BallotServiceImp implements BallotService {

	@Autowired
	private BallotRepository ballotRepo;

	@Override
	public boolean checkIfVoted(String username) {
		if (ballotRepo.findByUser(username) != null) {
			return true;
		}
		return false;
	}

	@Override
	public long getResult(String office) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public List<Ballot> saveAll(List<Ballot> ballotList) {
		List<Ballot> response = (List<Ballot>) ballotRepo.saveAll(ballotList);
		return response;
	}

	@Override
	@Transactional
	public List<Ballot> findAll() {
		List<Ballot> response = (List<Ballot>) ballotRepo.findAll();
		return response;
	}
}