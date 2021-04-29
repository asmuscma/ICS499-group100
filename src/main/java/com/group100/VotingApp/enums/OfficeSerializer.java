package com.group100.VotingApp.enums;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class OfficeSerializer extends StdSerializer<Office> {

	private static final long serialVersionUID = 1L;

	protected OfficeSerializer(Class<Office> t) {
		super(t);
	}

	@Override
	public void serialize(Office office, JsonGenerator generator, SerializerProvider provider) throws IOException,  JsonProcessingException {
		generator.writeStartObject();
        generator.writeFieldName("name");
        generator.writeString(office.name());
        generator.writeFieldName("office");
        generator.writeString(office.getOffice());
        generator.writeEndObject();
		
	}

}
