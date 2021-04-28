package com.group100.VotingApp.data.entity;

import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum enumTopicType {
	ENVIRONMENT("code1"),
	EDUCATION("code2"),
	CRIMINAL("code3"),
	FOREIGN("code4"),
	DOMESTIC("code5");
	
	private String code;
	
	private enumTopicType(String code) {
		this.code=code;
	}
	
	@JsonCreator
	public static enumTopicType decode(final String code) {
		return Stream.of(enumTopicType.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
	}
	
	@JsonValue
	public String getCode() {
		return code;
	}

}
