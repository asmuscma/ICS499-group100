package com.group100.VotingApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RACE")
public class Race {
	@Id
	@Column(name = "RACE_ID")
	private int raceID;
	@Column(name = "COUNT")
	private int count;
	@Column(name = "OFFICE")
	private String office;

	public Race(int raceID, int count, String office) {
		this.raceID = raceID;
		this.count = count;
		this.office = office;
	}

	/**
	 * @return the raceID
	 */
	public int getRaceID() {
		return raceID;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @return the office
	 */
	public String getOffice() {
		return office;
	}

	/**
	 * @param raceID the raceID to set
	 */
	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(String office) {
		this.office = office;
	}

}
