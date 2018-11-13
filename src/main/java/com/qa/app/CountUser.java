package com.qa.app;

import java.util.HashMap;
import java.util.stream.Collectors;

import com.qa.app.domain.Account;

public class CountUser {

	public int countForFirstName(String incomingName) {
		Service s = new Service(); 
		return s.getHmap().entrySet().stream().filter(e -> incomingName.equals(e.getValue().getFirstName())).collect(Collectors.toList()).size();
	}
	
	public int countForFirstName(String incomingName, HashMap<Integer,Account> hmap) {
		return hmap.entrySet().stream().filter(e -> incomingName.equals(e.getValue().getFirstName())).collect(Collectors.toList()).size();
	}

}
