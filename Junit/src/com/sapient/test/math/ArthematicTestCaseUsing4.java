/**
 * 
 */
package com.sapient.test.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.math.Arthematic;

/**
 * @author spra26
 *
 */
public class ArthematicTestCaseUsing4 {
	int firstNumber,secondNumber;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		firstNumber=2;
		secondNumber=4;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		firstNumber=0;
		secondNumber=0;
	}

	/**
	 * Test method for {@link com.sapient.math.Arthematic#sum(int, int)}.
	 */
	@Test
	public final void testSum() {
		int expectedResult=6;
		Arthematic arthematicObjectRef= new Arthematic();
		int actualResult=arthematicObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
	}

}
