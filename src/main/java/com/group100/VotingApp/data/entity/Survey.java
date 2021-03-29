package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Survey extends Poll {
	
	@OneToOne
	private User user;
	@OneToMany
	private List<Issue> issueList = new ArrayList<Issue>();

	public Survey() {

	}

	public Survey(String question, String answer, List<Issue> issueList) {
		super(question, answer);
		this.issueList = issueList;
	}

	public List<Issue> getIssueList() {
		return issueList;
	}

	public void setIssue(List<Issue> issueList) {
		this.issueList = issueList;
	}
}
