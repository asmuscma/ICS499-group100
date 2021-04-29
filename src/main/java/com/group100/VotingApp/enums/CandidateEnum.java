package com.group100.VotingApp.enums;

public enum CandidateEnum {
    JOHN("President", "JOHN FLAT"),
    JANE("President", "JANE TIRE"),
    ADAM("Senator", "ADAM REGINUEX"), 
	RORY("Senator", "RORY MCaDAMS"),
	HOPE("Senator2", "GEORGE HOPE"), 
	WASHINGTON("Senator2", "SLIM WASHINGTON"),
	VINCENT("GOVERNOR", "JAMAL VINCENT"),
	ALEXANDER("GOVERNOR", "HENRY ALEXANDER"),
	PERKINS("HOUSE_REP", "JULIO PERKINS"),
	REX("HOUSE_REP", "T_REX");
	

    private String office;
    private String name;

    private CandidateEnum(String office, String name) {
        this.office = office;
        this.name = name;
    }

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getName() {
		return name;
	}

	
}