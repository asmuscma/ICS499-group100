package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

@Entity
public class Survey {
	
	
	public enum topic {
		education, criminal, environment, domestic, foreign, health
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long surveyId;
	@OneToOne
	private User user;
	@OneToMany
	private List<Issue> issueList = new ArrayList<Issue>();

	public long getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(long surveyId) {
		this.surveyId = surveyId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setIssueList(List<Issue> issueList) {
		this.issueList = issueList;
	}

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
