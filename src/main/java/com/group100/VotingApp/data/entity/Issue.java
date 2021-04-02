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
	private String topic;
	private String question;
	@ManyToOne
	private Survey survey;
	private String opinion;

	public Issue() {

	}

	public Issue(String topic, String opinion) {
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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinions) {
		this.opinion = opinions;
	}
}
