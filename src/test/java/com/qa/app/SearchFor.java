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

}
