package com.group100.VotingApp.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Survey")
public class Survey {
	@Column(name="question")
	private String question;
	@Column(name="answer")
	private String answer;
	@Column(name="topic")
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
