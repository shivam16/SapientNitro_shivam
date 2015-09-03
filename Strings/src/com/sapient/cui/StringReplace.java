/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org = "This is a test. This is, too.";
	    String search = "is";
	    String sub = "was";
	    String result = "";
	    int i;

	    do { // replace all matching substrings
	      System.out.println(org);
	      i = org.indexOf(search);
	      if(i != -1) {
	        result = org.substring(0, i);
	        result = result + sub;
	        result = result + org.substring(i + search.length());
	        org = result;
	      }
	    } while(i != -1);

	}

}
