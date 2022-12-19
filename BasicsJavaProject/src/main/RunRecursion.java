package main;

public class RunRecursion {
	
	
	public static void printInfinite(int number,final int limit) {
		
		System.out.println(number);
		
		++number;
		
		if(number<=limit) {
			printInfinite(number,limit);
		}	
		
	}
	
	//first step
	
	// first = 1
	// second = 2
	// third = 3  // first + second
	
	//second step
	
	// first = 2 -> second of the previous or current step
	// second = 3 -> third of the previous or current step
	// third = 5  // first + second
	
	
	public static void fib(int firstNumber , int secondNumber , final int limit) {
		
		int thirdNumber = firstNumber + secondNumber;
		
		System.out.println(thirdNumber);
		
		if(thirdNumber<=limit) {
			
			fib(secondNumber,thirdNumber,limit);
			
		}
		
	}
	

	public static void main(String[] args) {
		
		RunRecursion.fib(0,1,100);
		
		//recursive function to print n numbers
//		RunRecursion.printInfinite(1,50);		
		
		
		//normal method to print fib series		
//		int firstNumber = 0;
//		int secondNumber = 1;
//		int thirdNumber = 0;		
//		
//		for (int i = 0; i <= 10; i++) {
//			
//			thirdNumber = firstNumber + secondNumber;
//			
//			System.out.println(thirdNumber);
//
//			firstNumber = secondNumber;
//			secondNumber = thirdNumber;	
//			
//		}
		
		
		

	}

}
