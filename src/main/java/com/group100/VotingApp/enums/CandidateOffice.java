package com.group100.VotingApp.enums;

public enum CandidateOffice {
	PRESIDENT("President / Vice-President"), GOVERNOR("Governor"), SENATOR("Senator");

	private String office;

	private CandidateOffice(String office) {
		this.office = office;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}