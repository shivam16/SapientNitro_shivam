/**
 * 
 */
package com.sapient.client.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.*;

/**
 * @author spra26
 *
 */
public class testHR {

	HR hr;
	Employee employee;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		hr=new HR();
		
			
			
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.cui.HR#recuit(java.lang.String)}.
	 */
	@Test
	public final void testRecuitForIntern() {
		//Object expected= new Intern();
		
        		employee = hr.recuit("I");
		assertTrue(employee instanceof Intern);
	
	}
	@Test
	public final void testRecuitForConfirmed() {
		//Object expected= new Intern();
		
	 employee = hr.recuit("C");
		assertTrue(employee instanceof Confirmed);
	
	}
	@Test
	public final void testRecuitForContract() {
		//Object expected= new Intern();
		
		employee = hr.recuit("T");
		assertTrue(employee instanceof Contract);
	
	}
	@Test
	public final void testRecuitForOther() {
		//Object expected= new Intern();
		
		employee = hr.recuit("A");
		assertNull(employee );
	
	}
	@Test
	public final void testRecuitFornull() {
		//Object expected= new Intern();
	
		Object actual = hr.recuit(null);
		assertNull(actual );
	
	}
/*	public final void testRecuitForIntern() {
		//Object expected= new Intern();
		HR hr = new HR();
		Object actual = hr.recuit("I");
		assertTrue(actual instanceof Intern);
	
	}
	public final void testRecuitForIntern() {
		//Object expected= new Intern();
		HR hr = new HR();
		Object actual = hr.recuit("I");
		assertTrue(actual instanceof Intern);
	
	}*/

}
