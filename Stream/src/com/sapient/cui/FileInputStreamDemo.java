/**
 * 
 */
package com.sapient.cui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author spra26
 *
 */
public class FileInputStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int size;
		InputStream f= new FileInputStream("src/com/sapient/cui/FileInputStreamDemo.java");
		System.out.println("Total Available Bytes: " + (size=f.available()));
		int n=size/40;
		System.out.println("First " + n + "bytes of the file one read() at a time");
		
		for(int i=0; i<n;i++){
			System.out.println(f.read());
		}
		System.out.println("\n Still Available: "+ f.available());
		System.out.println("Reading the next: "+ n + " with one read(b[])");
		byte[] b = new byte[n];
		if(f.read(b)!=n){
			System.err.println("couldn't read " + n + "bytes");
		}
		System.out.println(new String(b,0,n));
		System.out.println("\nStill Available: "+ (size = f.available()));
		System.out.println("Skipping half of remmaining bytes with skip()");
		f.skip(n/2);
		System.out.println("Still Available: "+ f.available());
		System.out.println("Reading "+n/2+ " into the end of the array");
		if(f.read(b, n/2, n/2)!=n/2){
			System.err.println("Couldn't read "+ n/2+ " bytes ");
		}
		System.out.println(new String(b,0,b.length));
		System.out.println("\nStill Available: "+ f.available());
		f.close();
		
		
		

	}

}
