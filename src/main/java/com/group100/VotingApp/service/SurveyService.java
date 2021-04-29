package com.group100.VotingApp.service;

import java.util.List;

import com.group100.VotingApp.data.entity.Survey;
import com.group100.VotingApp.data.entity.User;

public interface SurveyService {
	boolean checkIfVoted(User user);
	void submitSurvey(Survey survey);
	public List<Survey> saveAll(List<Survey> surveyList);
	public List<Survey> findAll();
}
