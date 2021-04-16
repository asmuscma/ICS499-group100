package com.group100.VotingApp.serviceImp;

import com.group100.VotingApp.data.entity.Issue;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.IssueRepository;
import com.group100.VotingApp.data.repository.SurveyRepository;
import com.group100.VotingApp.service.SurveyService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImp implements SurveyService {
	
	@Autowired
	private SurveyRepository surveyRepo;
	
	@Autowired
	private IssueRepository issueRepo;
	
	@Override
	public boolean checkIfVoted(User user) {
		if(surveyRepo.findByUser(user) != null) {
			return true;
		}
		return false;
	}
	
	public long getScore(User user) {
		List<Issue> issueList = new ArrayList<Issue>();
		issueList = issueRepo.findByUser(user);
		long score = 0;
		
		for(int i = 0; i < issueList.size(); i++) {
			score += issueList.get(i).getOpinion();
		}
		return score;
	}
}
