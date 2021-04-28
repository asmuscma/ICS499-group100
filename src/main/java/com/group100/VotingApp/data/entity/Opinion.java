package com.group100.VotingApp.data.entity;

public enum Opinion {
	YES("yes"),
	NO("no");

	 private final String displayValue;
	    
	    private Opinion(String displayValue) {
	        this.displayValue = displayValue;
	    }
	    
	    public String getDisplayValue() {
	        return displayValue;
	    }

}
