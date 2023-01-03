package com.methodindustries.problems;


public class FizzBuzz{

	int counter;
	FizzBuzz(int i){
		this.counter= i;
	}
	
	FizzBuzz() {};
	public void run() {
		for(int i =1; i<=this.counter; i++) {
			System.out.println(calculate(i));
			
	}
	}
	
	public String calculate(int i) {
		if(fizz(i) && buzz(i)) {
			return "FizzBuzz";
		}
		else if (fizz(i)) {
	      return"Fizz";

		}
		else if (buzz(i)) {
			return "Buzz";
	}
		else {
			 return Integer.toString(i);
		}
		
		
		
	}
	public static Boolean fizz(int i) {
		if( i%3 ==0) {
			return true;
		}
		return false;
	}
	public static  Boolean buzz(int i) {
		return i%5==0;
		}	
}