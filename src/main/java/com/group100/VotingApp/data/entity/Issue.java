package com.group100.VotingApp.data.entity;

import java.util.List;
import java.util.ArrayList;

/**
 * An object that represents a political issue which different users,
 * candidates, and parties will have different opinions on.
 */
public class Issue {

	String topic;
	List<String> opinions = new ArrayList<String>();
	public Issue(String topic, List<String> opinions) {
		this.topic = topic;
		this.opinions = opinions;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public List<String> getOpinions() {
		return opinions;
	}
	
	public void setOpinions(List<String> opinions) {
		this.opinions = opinions;
	}
}
