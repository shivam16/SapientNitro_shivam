package com.sapient.client.cui;

public class HR{
	public Employee recuit(String employee)  {
		if(employee.equals(null)){
			//Exception e= new NullPointerException();
		//	throw e;
		}
		if (employee.equalsIgnoreCase("I")) {
			return new Intern();
		} else if (employee.equalsIgnoreCase("C")) {
			return new Confirmed();
		}else if (employee.equalsIgnoreCase("T")) {
			return new Contract();
		}
		return null;
	}
}
