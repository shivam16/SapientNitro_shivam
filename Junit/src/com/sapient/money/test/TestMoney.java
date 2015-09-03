package com.sapient.money.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.money.Money;

public class TestMoney {
	Money m;
	Money n;
	
	@Before
	public void setUp() throws Exception {
		m=new Money(5000, "INR");
		n=null;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMoney() {
		Money expectedMoney= new Money(15000,"INR");
		
		assertEquals(expectedMoney.amount(),15000);
		assertEquals(expectedMoney.currency(),"INR");
	}

	@Test
	public final void testAmount() {
		int expectedAmount=5000;
		assertEquals(expectedAmount,m.amount());
	}

	@Test
	public final void testCurrency() {
		String expectedCurrency="INR";
		assertEquals(expectedCurrency,m.currency());
		
	}

	@Test
	public final void testAdd() {
		Money currMoney= new Money(10000,"INR");
		Money expectedMoney= new Money(15000,"INR");
		
		currMoney= currMoney.add(m);
		assertEquals(expectedMoney.amount(), currMoney.amount());
		assertEquals(expectedMoney.currency(), currMoney.currency());
		
		
		
	}
	@Test
	public final void testMoneyNegativeAmount() {
		assertTrue(m.amount()>=0);
		
	}
	
	@Test
	public final void testMoneyInvalidCurrency() {
		assertNotNull(m.currency());
		
	}
	@Test(expected=NullPointerException.class)
	public final void testMoneyInvalidAddMoney() {
		m.add(n);
		
	}
	
	
	

}
