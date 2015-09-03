/**
 * 
 */
package com.sapient.cui;

/**
 * @author spra26
 *
 */
class MyDate{
	
	
	private int date;//gbvcgbn
	private int mon;//xcbvn
	private int year;//xcbvbn 
	
	/**
	 * 
	 * @param date1
	 * @param mon
	 * @param year
	 */
	public MyDate(final int date1,final int mon, final int year){
		date= date1;
		this.setMon(mon);
		this.setYear(year);
		//System.out.println(this.date + this.mon + this.year);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDate() {
		return date;
	}
	/**
	 * 
	 * @param date
	 */
	public void setDate(final int date) {
		this.date = date;
	}
	/**
	 * 
	 * @return
	 */
	public int getMon() {
		return mon;
	}
	/**
	 * 
	 * @param mon
	 */
	public void setMon(final int mon) {
		this.mon = mon;
	}
	/**
	 * 
	 * @return
	 */
	public int getYear() {
		return year;
	}
	/**
	 * 
	 * @param year
	 */
	public void setYear(final int year) {
		this.year = year;
	}
	/**
	 * 
	 * @param days
	 * @return
	 */
	public MyDate addDays(int days){
		this.date+=7;
		
		return this;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + date + " " + mon + " " + year;
	}
		
	
}

/**
 * 
 * @author spra26
 *
 */
public class TestMyDate {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final MyDate my_birth = new MyDate(22,7,1964);
		final MyDate theNextWeek = my_birth.addDays(7);
		
		System.out.println(theNextWeek);
	}

}
