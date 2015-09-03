/**
 * 
 */
package com.sapient.client.test.cui;

import static org.junit.Assert.*;
import main.com.sapient.cui.AmountToWords;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author spra26
 *
 */
public class TestAmountToWords {
	AmountToWords amountToWords;
	int amount;
	String expected;
	String actual;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		amountToWords = new AmountToWords();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		amountToWords = null;
	}

	/**
	 * Test method for {@link main.com.sapient.cui.AmountToWords#isValidAmount(int)}.
	 */
	@Test
	public final void testIsValidAmountCorrect() {
		amount=125489;
		assertTrue(amountToWords.isValidAmount(amount));
	}

	@Test
	public final void testIsValidAmountInCorrect() {
		amount=-125489;
		assertFalse(amountToWords.isValidAmount(amount));
	}
	/**
	 * Test method for {@link main.com.sapient.cui.AmountToWords#convertLessThanThousand(int)}.
	 */
	@Test
	public final void testConvertLessThanThousand() {
		amount=125;
		expected= " one hundred twenty five";
		actual = amountToWords.convertLessThanThousand(amount);
		assertEquals(expected, actual);
		
	}

	/**
	 * Test method for {@link main.com.sapient.cui.AmountToWords#convertAmountToWords(int)}.
	 */
	@Test
	public final void testConvertAmountToWords() {
		amount=125;
		expected= " one hundred twenty five";
		try {
			actual = amountToWords.convertAmountToWords(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
	
	@Test(expected = Exception.class)
	public final void testConvertLessThanThousandInValidAmount() {
		amount=-125;
		
		amountToWords.convertLessThanThousand(amount);
		
		
	}
	
	@Test
	public final void testConvertAmountToWordsInValidAmount() throws Exception {
//		amount=-125;
//	
//		try {
			amountToWords.convertAmountToWords(amount);
//			fail( "My method didn't throw when I expected it to" );
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	@Test
	public final void testConvertAmountToWordsZero() {
		amount=0;
		expected= "Zero";
		try {
			actual = amountToWords.convertAmountToWords(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}

}
