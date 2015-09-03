package com.sapient.client.cui;















public class MainApp {
	public static void main(String args[]) {
		HR hr = new HR();
		
		
		Finance finance= new Finance();
		Employee employee = hr.recuit("C");// Upcast
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee = hr.recuit("I");
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee = hr.recuit("T");
		if (employee != null) {
			finance.processSalary(employee);
		}
	}
}

