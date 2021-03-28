package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Survey extends Poll {
	@OneToOne
	private User user;
	@OneToOne
	private Issue issue;

	public Survey() {

	}

	public Survey(String question, String answer, Issue issue) {
		super(question, answer);
		this.issue = issue;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}
}
