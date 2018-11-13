package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.app.domain.Account;
import com.qa.utils.PersonToJSON;

public class SearchFor {

	@Test
	public void test1() {
		CountUser cu = new CountUser();
		assertEquals(2,cu.countForFirstName("John"));
	}
	
	@Test
	public void test2() {
		CountUser cu = new CountUser();
		assertEquals(0,cu.countForFirstName("Trevor"));
	}
	
	@Test
	public void test3() {
		CountUser cu = new CountUser();
		assertEquals(1,cu.countForFirstName("Dave"));
	}
	
	@Test
	public void test4() {
		Service s = new Service();
		s.addToHashMap(s.createAccount("John", "Gordon", "34RESF22W1"));
		assertEquals(4,s.getHmap().size());
	}
	
	@Test
	public void test5() {
		Account a = new Account("Dee" , "Dee", "Dee");
		a.setFirstName("Tom");
		assertEquals("Tom",a.getFirstName());
	}
	@Test
	public void test6() {
		Account a = new Account("Dee" , "Dee", "Dee");
		a.setLastName("Tom");
		assertEquals("Tom",a.getLastName());
	}
	@Test
	public void test7() {
		Account a = new Account("Dee" , "Dee", "Dee");
		a.setAccountNumber("Tom");
		assertEquals("Tom",a.getAccountNumber());
	}
	@Test
	public void test8() {
		Account a = new Account("Dee" , "Dee", "Dee");
		String test = "Nope";
		try {
			test = PersonToJSON.convertPerson(a);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("{\r\n" + 
				"  \"firstName\" : \"Dee\",\r\n" + 
				"  \"lastName\" : \"Dee\",\r\n" + 
				"  \"accountNumber\" : \"Dee\"\r\n" + 
				"}",test);
	}
	
	@Test
	public void test9() {
		Service s = new Service();
		Account a = new Account("David", "Gordon", "HHDD22");
		int b = s.addToHashMap(a);
		assertEquals(a, s.getByKey(b));
	}
	
	@Test
	public void test10() {
		Control c = new Control();
		assertEquals(true, c.runTest());
	}
}
