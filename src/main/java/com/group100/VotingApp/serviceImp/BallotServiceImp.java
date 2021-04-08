package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.repository.BallotRepository;
import com.group100.VotingApp.service.BallotService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BallotServiceImp implements BallotService {
	
	@Autowired
	private BallotRepository ballotRepo;

	@Override
	public boolean checkIfVoted(String username) {
		if(ballotRepo.findByUsername(username) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Map<Candidate, Long> getResult(String office, String state) {
		List<Candidate> voteList = new ArrayList<Candidate>();
		voteList = ballotRepo.findByOfficeAndState(office, state);
		Map<Candidate, Long> freq = voteList.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		return freq;
	}

}
