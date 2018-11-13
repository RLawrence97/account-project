package com.qa.app;

import static org.junit.Assert.*;

import org.junit.Test;

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
}
