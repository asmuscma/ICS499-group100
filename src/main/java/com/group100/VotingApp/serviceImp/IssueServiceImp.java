package com.group100.VotingApp.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group100.VotingApp.data.entity.Issue;
import com.group100.VotingApp.data.entity.User;
import com.group100.VotingApp.data.repository.IssueRepository;
import com.group100.VotingApp.service.IssueService;

@Service
public class IssueServiceImp implements IssueService {

	@Autowired
	private IssueRepository issueRepo;

	@Override
	public void submitSurvey(Issue iss) {
		issueRepo.save(iss);
	}

	@Override
	public boolean checkIfVoted(User user) {
		if (issueRepo.findByUser(user) != null) {
			return true;
		}
		return false;
	}

	/*
	 * public long getScore(User user) { List<Issue> issueList = new
	 * ArrayList<Issue>(); issueList = issueRepo.findByUser(user); long score = 0;
	 * 
	 * for(int i = 0; i < issueList.size(); i++) { score +=
	 * issueList.get(i).getOpinion(); } return score; }
	 */
}
