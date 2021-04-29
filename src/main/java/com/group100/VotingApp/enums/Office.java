package com.group100.VotingApp.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Office {
President("President"),
Senator("Senator"),
Senator2("Senator2"),
District_Attorney("district"),
Governor("governor"),
House_rep("house");
	
	Office(String office) {
	// TODO Auto-generated constructor stub
		this.office=office;
}

	private String office;
	
	@JsonValue
	public String getOffice() {
		return office;
	}
	
}
