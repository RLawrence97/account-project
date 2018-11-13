package com.qa.app;
import com.qa.app.domain.Account;

public class Control {
	public void runTest () {
		Service service = new Service();
		int tempKey[] = new int[6];
		for (int i = 0; i < 6; i++) {
			tempKey[i] = service.addToHashMap(service.createAccount("John", "Gordon", "A227DE11" + i));
		}
		
		for (int j = 0; j < 6; j++) {
			try {
				Account temporaryAccount = service.getByKey(tempKey[j]);
				String printedAccount = "Name: " + temporaryAccount.getFirstName() + " " + temporaryAccount.getLastName() + "\nAccount Number: " + temporaryAccount.getAccountNumber();
				System.out.println(printedAccount);
			} catch (NullPointerException npe) {
				System.out.println(npe.toString());
			}
		}
	}
}
