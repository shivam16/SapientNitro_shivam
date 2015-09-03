/**
 * 
 */
package com.sapient.client.cui;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author spra26
 *
 */
@SuppressWarnings("serial")
class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You are ineligible to vote";
	}
}

class Base {
	public void test() throws SQLException,IOException{
		System.out.println("Base");
	}
}

class Derived extends Base{
	public void test() throws EOFException{
		System.out.println("Derived");
	}
}


class Vote{
	public void register(int age) throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You are eligible to vote");
	}
}

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Vote vote = new Vote();
		
		try {
			vote.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Base b=new Derived();
		try {
			b.test();
		} catch (SQLException|IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("End");

	}

}
