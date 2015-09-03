/**
 * 
 */
package com.sapient.test.math;

import com.sapient.math.Arthematic;

import junit.framework.TestCase;

/**
 * @author spra26
 *
 */
public class ArthematicTestCase extends TestCase {
	int firstNumber,secondNumber;
		@Override
		protected void setUp() throws Exception {
			// TODO Auto-generated method stub
			firstNumber=2;
			secondNumber=4;
		}
	/**
	 * Test method for {@link com.sapient.math.Arthematic#sum(int, int)}.
	 */
	public final void testSum() {
		int expectedResult=6;
		Arthematic arthematicObjectRef= new Arthematic();
		int actualResult=arthematicObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Override
	protected void tearDown() throws Exception {
	// TODO Auto-generated method stub
	firstNumber=0;
	secondNumber=0;
	}

}
