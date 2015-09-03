/**
 * 
 */
package com.sapient.client.test.cui;

import java.util.Scanner;
import com.sapient.client.cui.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author spra26
 *
 */
public class TestPerfectNumber {
	PerfectNumber perfectNumber;
	int number;
	Scanner input;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		perfectNumber = new PerfectNumber();
		input = new Scanner(System.in);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.cui.PerfectNumber#sumOfDivisorExceptItself(int)}.
	 */
	@Test
	public final void testSumOfDivisorExceptItselfForPositiveIntegers() {
		number = input.nextInt();
		int expectedValue = number;
		int actualValue = perfectNumber.sumOfDivisorExceptItself(number);
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public final void testSumOfDivisorExceptItselfForNegativeIntegers() {
		number = input.nextInt();
		int expectedValue = 0;
		int actualValue = perfectNumber.sumOfDivisorExceptItself(number);
		
		assertEquals(expectedValue, actualValue);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.PerfectNumber#isPerfect(int)}.
	 */
	@Test
	public final void testIsPerfectForTrue() {
		number = input.nextInt();
		assertTrue(perfectNumber.isPerfect(number));
	}

	@Test
	public final void testIsPerfectForFalse() {
		number = input.nextInt();
		assertFalse(perfectNumber.isPerfect(number));
	}
		
}
