package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.group100.VotingApp.enums.Opinion;
import com.group100.VotingApp.enums.Topic;

/**
 * An object that represents a political issue which different users,
 * candidates, and parties will have different opinions on.
 */
@Entity
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String issueId;
	@ManyToOne
	private User user;
	@ManyToOne
	private Survey survey;
	private Topic topic;
	private Opinion opinion;

	public Issue() {

	}

	public Issue(Topic topic, Opinion opinion) {
		this.topic = topic;
		this.opinion = opinion;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Opinion getOpinion() {
		return opinion;
	}

	public void setOpinion(Opinion opinion) {
		this.opinion = opinion;
	}
	
	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
}
