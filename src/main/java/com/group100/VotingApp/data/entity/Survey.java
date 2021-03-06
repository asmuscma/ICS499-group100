package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.group100.VotingApp.enums.Opinion;
import com.group100.VotingApp.enums.Topic;

/**
 * An object that represents a political issue which different users,
 * candidates, and parties will have different opinions on.
 */
@Entity
public class Survey {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long issueId;
	@OneToOne
	private User user;
	
	@Enumerated(EnumType.STRING)
	private Topic topic;
	@Enumerated(EnumType.STRING)
	private Opinion opinion;

	public Survey() {

	}

	public Survey(Topic topic, Opinion opinion) {
		this.topic = topic;
		this.opinion = opinion;
	}

	public Topic getTopic() {
		return topic;
	}

	public Opinion getOpinion() {
		return opinion;
	}

	public void setOpinion(Opinion opinion) {
		this.opinion = opinion;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public long getSurveyId() {
		return issueId;
	}

	public void setSurveyId(long issueId) {
		this.issueId = issueId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
