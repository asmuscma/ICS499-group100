package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.repository.SurveyRepository;
import com.group100.VotingApp.service.SurveyService;

import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImp implements SurveyService {
	
	private SurveyRepository surveyRepo;
	
	@Override
	public boolean checkIfVoted(String username) {
		if(surveyRepo.findByUsername(username) != null) {
			return true;
		}
		return false;
	}

}
