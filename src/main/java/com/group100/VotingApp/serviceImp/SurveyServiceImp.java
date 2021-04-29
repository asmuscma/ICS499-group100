package com.group100.VotingApp.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Override
	@Transactional
	public List<Survey> saveAll(List<Survey> surveyList) {
		List<Survey> response = (List<Survey>)surveyRepo.saveAll(surveyList);
		return response;
	}
	
	@Override
	@Transactional
	public List<Survey> findAll() {
		List<Survey> response = (List<Survey>)surveyRepo.findAll();
		return response;
	}
	
	public long getTopicScore(User user, String topic) {
		List<Survey> surveyList = new ArrayList<Survey>();
		surveyList = surveyRepo.findByUserAndTopic(user, topic);
		long score = 0;
		
		for(int i = 0; i < surveyList.size(); i++) {
			if(surveyList.get(i).getOpinion().getOpinion() == "Yes") {
				score++;
			}
		}
		return score;
	}
}
