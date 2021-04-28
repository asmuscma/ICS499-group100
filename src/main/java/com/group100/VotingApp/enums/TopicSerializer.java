package com.group100.VotingApp.enums;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class TopicSerializer extends StdSerializer<Topic> {
	private static final long serialVersionUID = 1L;
	
	public TopicSerializer() {
		super(Topic.class);
	}
	
	public TopicSerializer(Class<Topic> t) {
		super(t);
	}
	
	public void serialize(Topic topic, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
		generator.writeStartObject();
        generator.writeFieldName("name");
        generator.writeString(topic.name());
        generator.writeFieldName("topic");
        generator.writeString(topic.getTopic());
        generator.writeEndObject();
	}
}
