package com.group100.VotingApp.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;

@Repository
public interface BallotRepository extends JpaRepository<Ballot, Long> {
	public User findByUsername(String username);
	public List<Candidate> findByOfficeAndState(String office, String state);
}
