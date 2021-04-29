package com.group100.VotingApp.enums;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CandidateEnumSerializer extends StdSerializer<CandidateEnum> {

	private static final long serialVersionUID = 1L;

	protected CandidateEnumSerializer(Class<CandidateEnum> t) {
		super(t);
	}

	@Override
	public void serialize(CandidateEnum candidateEnum, JsonGenerator generator, SerializerProvider provider) throws IOException,  JsonProcessingException {
		generator.writeStartObject();
        generator.writeFieldName("office");
        generator.writeString(candidateEnum.getOffice());
        generator.writeFieldName("name");
        generator.writeString(candidateEnum.getName());
        generator.writeEndObject();
	}

}
