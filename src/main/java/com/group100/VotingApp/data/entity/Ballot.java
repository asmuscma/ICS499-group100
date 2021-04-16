package com.group100.VotingApp.data.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ballot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ballotId;
	@OneToOne
	private User user;
	@OneToMany
	private List<Race> raceList = new ArrayList<Race>();

	public Ballot() {

	}

	public Ballot(User user, List<Race> raceList) {
		this.user = user;
		this.raceList = raceList;
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
