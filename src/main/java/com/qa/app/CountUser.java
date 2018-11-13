package com.qa.app;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import com.qa.app.domain.Account;

public class CountUser {

	public int countForFirstName(String incomingName) {
		Service s = new Service();
		int temp = 0;
		try {
		Set<Entry<Integer, Account>> set = s.getHmap().entrySet();
	      Iterator<Entry<Integer, Account>> iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Entry<Integer, Account> mentry = iterator.next();
	         if (mentry.getValue().getFirstName().equals(incomingName)) {
	        	temp++;
	         }
	      }
		} catch(NullPointerException npe) {
			System.out.println(npe.toString());
		}
		return temp;
	}

}
