package com.sapient.client.cui;

public class Finance{
	public void processSalary(Employee emp){
		emp.netSalary();
		if (emp instanceof Confirmed){
			Confirmed conf =(Confirmed) emp;//Downcast
			conf.transport();
		}
			
	}
}