package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Topic {
	ENVIRONMENT("Environment"),
	EDUCATION("Education"),
	CRIMINAL("Criminal"),
	FOREIGN("Foreign"),
	DOMESTIC("Domestic"),
	HEALTH("Health"),
	SOCIAL("Social"),
	ELECTORAL("Electoral");
	
	
	private String topic;
	
	private Topic(String topic) {
		this.topic = topic;
	}
	
	@JsonValue
	public String getTopic() {
		return topic;
	}
}