/**
 * 
 */
package com.sapient.cui;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author spra26
 *
 */
public class ChangeCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperties());
		Properties sysProperties = System.getProperties();
		
		Enumeration keys= sysProperties.keys();
		String key;
		
		while(keys.hasMoreElements()){
			key=(String) keys.nextElement();
			System.err.println(key+" : "+sysProperties.get(key));
		}
	}

}
