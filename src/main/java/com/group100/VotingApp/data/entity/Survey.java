package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Survey")
public class Survey extends Poll {
	@Column(name = "ISSUE")
	private Issue issue;

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
