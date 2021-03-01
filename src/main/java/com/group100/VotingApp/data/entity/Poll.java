package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A poll is an abstract superclass for Survey and Ballot. The two fields that
 * this contains is question and answer
 */
@Entity
public abstract class Poll {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question")
	String question;
	@Column(name="answer")
	String answer;

	public Poll(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
