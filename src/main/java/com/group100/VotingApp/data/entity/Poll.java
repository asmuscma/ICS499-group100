package com.group100.VotingApp.data.entity;

/**
 * A poll is an abstract superclass for Survey and Ballot. The two fields that
 * this contains is question and answer
 */
public abstract class Poll {

	String question;
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