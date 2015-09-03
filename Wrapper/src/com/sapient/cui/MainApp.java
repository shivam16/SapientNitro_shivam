/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
class Data{
	private int firstNumber;
	private int secondNumber;
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Data d = null;
		if(obj!= null && obj instanceof Data){
		 d = (Data) obj;//check instanceof and null.
		}
		
		if(d.getFirstNumber()==this.getFirstNumber()){
			if(d.getSecondNumber()== this.getSecondNumber()){
				return true;
			}
		}
		return false;
	}
}

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.toBinaryString(-7));
		
		Data d1 =new Data();
		Data d2 =new Data();
		
		d1.setFirstNumber(2);
		d1.setSecondNumber(3);
		d2.setFirstNumber(2);
		d2.setSecondNumber(3);
		
		System.out.println(d1.equals(d2));
	}

}
