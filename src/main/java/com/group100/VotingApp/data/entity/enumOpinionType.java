package com.group100.VotingApp.data.entity;

import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum enumOpinionType {

	YES("code1"),
	NO("code2");
	
	private String code;
	
	private enumOpinionType(String code) {
		this.code=code;
	}
	
	@JsonCreator
	public static enumOpinionType decode(final String code) {
		return Stream.of(enumOpinionType.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
	}
	
	@JsonValue
	public String getCode() {
		return code;
	}
}
