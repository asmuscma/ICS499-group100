package com.group100.VotingApp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Ballot;

@Repository
public interface BallotRepository extends JpaRepository<Ballot, Long> {

}