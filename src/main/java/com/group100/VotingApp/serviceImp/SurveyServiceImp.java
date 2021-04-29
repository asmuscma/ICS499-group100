package com.group100.VotingApp.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group100.VotingApp.data.entity.Survey;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.SurveyRepository;
import com.group100.VotingApp.service.SurveyService;

@Service
public class SurveyServiceImp implements SurveyService {

	@Autowired
	private SurveyRepository surveyRepo;

	@Override
	public void submitSurvey(Survey survey) {
		surveyRepo.save(survey);
	}

	@Override
	public boolean checkIfVoted(User user) {
		if (surveyRepo.findByUser(user) != null) {
			return true;
		}
		return false;
	}

	/*
	 * public long getScore(User user) { List<Survey> surveyList = new
	 * ArrayList<Survey>(); surveyList = surveyRepo.findByUser(user); long score = 0;
	 * 
	 * for(int i = 0; i < surveyList.size(); i++) { score +=
	 * surveyList.get(i).getOpinion(); } return score; }
	 */
}
