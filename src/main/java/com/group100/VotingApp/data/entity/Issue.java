package com.group100.VotingApp.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;
import java.util.ArrayList;

/**
 * An object that represents a political issue which different users,
 * candidates, and parties will have different opinions on.
 */
@Entity
@Table(name = "ISSUE")
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ISSUE_ID")
	private long issueId;
	@Column(name = "TOPIC")
	private String topic;
	@OneToOne(cascade = CascadeType.ALL)
	private Survey survey;
	@ElementCollection
	private List<String> opinions = new ArrayList<String>();

	public Issue() {

	}

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

	/*public List<String> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<String> opinions) {
		this.opinions = opinions;
	}*/
}
