/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
public class getCharsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a demo of the getChars method.";
	    int start = 10;
	    int end = 14;
	    char buf[] = new char[end - start];

	    s.getChars(start, end, buf, 0);
	    System.out.println(buf);
	}

}
