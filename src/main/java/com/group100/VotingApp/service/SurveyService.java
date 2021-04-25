package com.group100.VotingApp.service;

import com.group100.VotingApp.data.entity.Issue;
import com.group100.VotingApp.data.entity.User;

public interface SurveyService {
	boolean checkIfVoted(User user);

	void submitSurvey(Issue iss);
}
