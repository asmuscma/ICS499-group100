package com.group100.VotingApp.data.entity;

public class Widget {
private String topic;
private String opinion;
public String getTopic() {
	return topic;
}
public void setTopic(String topic) {
	this.topic = topic;
}
public String getOpinion() {
	return opinion;
}
public void setOpinion(String opinion) {
	this.opinion = opinion;
}
@Override
public String toString() {
	return "Widget [topic=" + topic + ", opinion=" + opinion + "]";
}

}
