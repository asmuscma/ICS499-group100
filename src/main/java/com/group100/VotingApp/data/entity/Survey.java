package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SURVEY")
public class Survey extends Poll {
	@OneToOne(mappedBy = "survey")
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
