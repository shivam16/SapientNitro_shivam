/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
public class EqualsNotEqualTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
	    String s2 = new String(s1);

	    System.out.println(s1 + " equals " + s2 + " -> " +  
	                       s1.equals(s2));
	    System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
	}

}
