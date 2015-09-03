/**
 * 
 */
package com.sapient.cui;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author spra26
 *
 */
public class Write {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address= new Address();
		 address.setStreet("Park Street");
		 address.setCountry("India");
		 try{
			 FileOutputStream fout = new FileOutputStream("D:\\address.ser");
			 ObjectOutputStream oos = new ObjectOutputStream(fout);
			 oos.writeObject(address);
			 oos.close();
			 System.out.println("Done");
		 } catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 
	}

}
