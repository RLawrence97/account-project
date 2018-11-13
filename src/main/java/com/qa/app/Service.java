package com.qa.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.qa.app.domain.Account;

public class Service {
	private HashMap<Integer, Account> hmap;

	public Service() {
		hmap = new HashMap<Integer, Account>();
		hmap.put(1, new Account("John", "Gordon", "AJJ12334"));
		hmap.put(2, new Account("Dave", "McDave", "JKJ3435A1"));
		hmap.put(3, new Account("John", "Davis", "DD664FG22"));
	}

	public int addToHashMap(Account incomingAccount) {
		int temp = 0;
		try {
			Set<Entry<Integer, Account>> set = hmap.entrySet();
			Iterator<Entry<Integer, Account>> iterator = set.iterator();
			while (iterator.hasNext()) {
				Entry<Integer, Account> mentry = iterator.next();
				if (mentry.getKey() > temp) {
					temp = mentry.getKey();
				}
			}
			temp++;
		} catch (NullPointerException npe) {
			System.out.println(npe.toString());
		}
		hmap.put(temp, incomingAccount);
		return temp;
	}

	public Account getByKey(int incomingKey) {
		Set<Entry<Integer, Account>> set = hmap.entrySet();
		Iterator<Entry<Integer, Account>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Account> mentry = iterator.next();
			if (mentry.getKey() == incomingKey) {
				return mentry.getValue();
			}
		}
		return null;
	}

	public Account createAccount(String incomingFirstName, String incomingLastName, String incomingAccountNum) {
		return new Account(incomingFirstName, incomingLastName, incomingAccountNum);
	}

	public HashMap getHmap() {
		return this.hmap;
	}
}
