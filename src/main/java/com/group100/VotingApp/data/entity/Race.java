package com.group100.VotingApp.data.entity;

import javax.persistence.Entity;

@Entity
public class Race extends Poll {
	private int count;
	private String office;

	public Race() {

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
