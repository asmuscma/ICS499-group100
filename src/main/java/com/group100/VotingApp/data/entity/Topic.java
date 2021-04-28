package com.group100.VotingApp.data.entity;

public enum Topic {
	
	ENVRIONMENT("environment"),
	EDUCATION("education"),
	CRIMINAL("criminal");
	 private final String displayValue;
	    
	    private Topic(String displayValue) {
	        this.displayValue = displayValue;
	    }
	    
	    public String getDisplayValue() {
	        return displayValue;
	    }

}
