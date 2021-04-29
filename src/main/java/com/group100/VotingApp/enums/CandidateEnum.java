package com.group100.VotingApp.enums;

public enum CandidateEnum {
    JOHN("President", "JOHN"),
    JANE("President", "JANE"),
    ADAM("Vice-President", "ADAM"); 

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