/**
 * 
 */
package com.sapient.cui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author spra26
 *
 */
public class DataIODemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream fout = new FileOutputStream("Test.dat");
		DataOutputStream out = new DataOutputStream(fout);
		
		 ((OutputStream) out).(98.6);
		((Object) out).methodName(1000);
		((Object) out).methodName(true);
		
		out.close();
		
		FileInputStream fin=new FileInputStream("Test.dat");
		DataInputStream in = new DataInputStream(fin);
		
		double d =in.readDouble();
		int i =  in.available();
		boolean b= in.markSupported();
		
		System.out.println("Here are the values: " + d + " "+ i+ " " + b);
		in.close();
		
		
		
		
		
		

	}

}
