package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.SurveyRepository;
import com.group100.VotingApp.service.SurveyService;

import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImp implements SurveyService {
	
	private SurveyRepository surveyRepo;
	
	@Override
	public boolean checkIfVoted(User user) {
		if(surveyRepo.findByUser(user) != null) {
			return true;
		}
		return false;
	}

}
