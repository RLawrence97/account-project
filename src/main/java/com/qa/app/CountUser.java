package com.qa.app;

import java.util.stream.Collectors;

public class CountUser {

	public int countForFirstName(String incomingName) {
		Service s = new Service(); 
		return s.getHmap().entrySet().stream().filter(e -> incomingName.equals(e.getValue().getFirstName())).collect(Collectors.toList()).size();
	}

}
