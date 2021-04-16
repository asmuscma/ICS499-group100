package com.group100.VotingApp.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Ballot;
import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.User;

@Repository
public interface BallotRepository extends JpaRepository<Ballot, Long> {
	public User findByUser(User user);
	@Query(value = "select * from ballot natural join ballot_race_list natural join race natural join person where office = ?1 and state = ?2", nativeQuery = true)
	public List<Candidate> findByOfficeAndState(String office, String state);
}
