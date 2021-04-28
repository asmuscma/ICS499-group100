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
	private String issueId;
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Survey survey;
	private enumTopicType topic;
	private enumOpinionType opinion;
	public Issue() {

	}

	public Issue(enumTopicType topic, enumOpinionType opinion) {
		this.topic = topic;
		this.opinion = opinion;
	}

	public enumTopicType getTopic() {
		return topic;
	}

	public void setTopic(enumTopicType topic) {
		this.topic = topic;
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

	public enumOpinionType getOpinion() {
		return opinion;
	}

	public void setOpinion(enumOpinionType opinion) {
		this.opinion = opinion;
	}
}
