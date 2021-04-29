package com.group100.VotingApp.enums;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class PartySerializer extends StdSerializer<Party> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected PartySerializer(Class<Party> t) {
		super(t);
		
	}

	@Override
	public void serialize(Party party, JsonGenerator generator, SerializerProvider provider) throws IOException {
		generator.writeStartObject();
        generator.writeFieldName("name");
        generator.writeString(party.name());
        generator.writeFieldName("party");
        generator.writeString(party.getParty());
        generator.writeEndObject();
		
		
		
	}

}
