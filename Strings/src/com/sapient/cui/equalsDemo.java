/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
public class equalsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
	    String s2 = "Hello";
	    String s3 = "Good-bye";
	    String s4 = "HELLO";
	    System.out.println(s1 + " equals " + s2 + " -> " +
	                       s1.equals(s2));
	    System.out.println(s1 + " equals " + s3 + " -> " +
	                       s1.equals(s3));
	    System.out.println(s1 + " equals " + s4 + " -> " +
	                       s1.equals(s4));
	    System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " +
	                       s1.equalsIgnoreCase(s4));
	}

}
