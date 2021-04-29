package com.group100.VotingApp.enums;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class OpinionSerializer extends StdSerializer<Opinion> {
	private static final long serialVersionUID = 1L;
	
	public OpinionSerializer() {
		super(Opinion.class);
	}
	
	public OpinionSerializer(Class<Opinion> t) {
		super(t);
	}
	
	public void serialize(Opinion opinion, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
		generator.writeStartObject();
        generator.writeFieldName("opinion");
        generator.writeString(opinion.getOpinion());
        generator.writeEndObject();
	}
}