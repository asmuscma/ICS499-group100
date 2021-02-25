package com.group100.VotingApp.data.entity;

public class Survey {
	private String question;
	private String answer;
	private String topic;

	public Survey(String question, String answer, String topic) {
		super();
		this.question = question;
		this.answer = answer;
		this.topic = topic;
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

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
