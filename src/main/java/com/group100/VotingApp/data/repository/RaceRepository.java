package com.group100.VotingApp.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Candidate;
import com.group100.VotingApp.data.entity.Race;


@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
	@Query(value = "select * from race natural join person where office = ?1 and state = ?2", nativeQuery = true)
	public List<Candidate> findByOfficeAndState(String office, String state);
}
