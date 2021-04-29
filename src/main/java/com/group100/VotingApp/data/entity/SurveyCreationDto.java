package com.group100.VotingApp.data.entity;

import java.util.List;

public class SurveyCreationDto {
	private List<Survey> surveys;
	
	public SurveyCreationDto() {
		
	}
	
	public SurveyCreationDto(List<Survey> surveys) {
		this.surveys = surveys;
	}
	
	public void addSurvey(Survey survey) {
		this.surveys.add(survey);
	}

	public List<Survey> getSurveys() {
		return surveys;
	}

	public void setSurveys(List<Survey> surveys) {
		this.surveys = surveys;
	}
	
	
}
