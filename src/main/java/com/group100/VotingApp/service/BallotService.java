package com.group100.VotingApp.service;

import java.util.List;

import com.group100.VotingApp.data.entity.Ballot;

public interface BallotService {
	public boolean checkIfVoted(String username);
	public long getResult(String office);
	public List<Ballot> saveAll(List<Ballot> ballotList);
	public List<Ballot> findAll();
}
