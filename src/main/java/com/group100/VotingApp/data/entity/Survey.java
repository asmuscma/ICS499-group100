package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Survey {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long surveyId;
	@OneToOne
	private User user;
	@OneToMany
	private List<Issue> issueList = new ArrayList<Issue>();

	public Survey() {

	}

	public Survey(User user, List<Issue> issueList) {
		this.user = user;
		this.issueList = issueList;
	}

	public List<Issue> getIssueList() {
		return issueList;
	}

	public void setIssue(List<Issue> issueList) {
		this.issueList = issueList;
	}
}
