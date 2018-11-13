package com.qa.utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.app.domain.Account;

public class PersonToJSON {
	public static String convertPerson(Account incomingAccount) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String JsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(incomingAccount);
		return JsonString;
	}
}
