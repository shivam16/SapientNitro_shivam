/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
public class SubStringCons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte ascii[] = {65, 66, 67, 68, 69, 70 };

		    String s1 = new String(ascii);
		    System.out.println(s1);

		    String s2 = new String(ascii, 2, 3);
		    System.out.println(s2);
	}

}
