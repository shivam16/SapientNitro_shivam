package com.sapient.client.cui;

public class PerfectNumber {

	int number;

	public int sumOfDivisorExceptItself(int number){
	 
		int sumOfDivisors = 0;
		for(int counter = 1; counter <= (number/2); counter++){
			if((number % counter) == 0){
				sumOfDivisors += counter;
			}
		}
		return sumOfDivisors;
	}

	public boolean isPerfect(int number) {
		if(number == sumOfDivisorExceptItself(number)){
			return true;
		} else {
			return false;
		}
	}
}
