/**
 * 
 */
package com.sapient.cui.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author spra26
 *
 */

@SuppressWarnings("serial")
class Sample implements Serializable{
	String s;
	int i;
	double d;
	
	public Sample(String s, int i, double d){
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString(){
		return "s= "+s+" i= "+i+" d= "+d;
	}
}

public class SerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Sample object1 = new Sample("Hi",-7,2.7);
		System.out.println("object1: "+object1);
		FileOutputStream fos = new FileOutputStream("Store");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(object1);
		oos.flush();
		oos.close();
		}
		catch(IOException e){
			System.out.println("Exception: "+e);
		}
		
		
		try{
		Sample object2;
		FileInputStream fis = new FileInputStream("store");
		ObjectInputStream ois = new ObjectInputStream(fis);
		object2 = (Sample) ois.readObject();
		ois.close();
		System.out.println("object2: "+object2);
		}catch(Exception e){
			System.out.println("Exception: "+e);
		}

	}

}
