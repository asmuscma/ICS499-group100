package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Ballot extends Poll {
	@OneToOne
	@Column(unique = true)
	private User user;
	@OneToMany
	private List<Race> raceList = new ArrayList<Race>();

	public Ballot() {

	}

	public Ballot(String question, String answer) {
		super(question, answer);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Race> getRaceList() {
		return raceList;
	}

	public void setRace(List<Race> raceList) {
		this.raceList = raceList;
	}
}
