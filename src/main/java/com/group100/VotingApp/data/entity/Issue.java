package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * An object that represents a political issue which different users,
 * candidates, and parties will have different opinions on.
 */
@Entity
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long issueId;
	@ManyToOne
	private User user;
	private String topic;
	@ManyToOne
	private Survey survey;
	private long opinion;

	public Issue() {

	}

	public Issue(String topic, long opinion) {
		this.topic = topic;
		this.opinion = opinion;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public long getIssueId() {
		return issueId;
	}

	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public long getOpinion() {
		return opinion;
	}

	public void setOpinion(long opinion) {
		this.opinion = opinion;
	}
}
