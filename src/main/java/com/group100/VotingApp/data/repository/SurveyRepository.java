package com.group100.VotingApp.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group100.VotingApp.data.entity.Survey;
import com.group100.VotingApp.data.entity.User;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
	public User findByUser(User user);
	public void saveAll(List<Survey> list);
	public List<Survey> findAll();
}
