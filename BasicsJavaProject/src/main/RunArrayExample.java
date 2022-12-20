package main;

import java.util.Scanner;

public class RunArrayExample {
	
	
	//the function is for storing data in a array	
	// function definition
	public static int[] populateArray(int numbers[]) {
		
		System.out.println("Enter numbers into array\n\n");
		
		Scanner scanner = new Scanner(System.in);
				
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println("Enter value for position => "+(i+1)+" of the array :");
			
			numbers[i] = scanner.nextInt();
			
		}
		
		//returning an array
		return numbers;	
				
	}
	
	
	

	public static void main(String[] args) {
		
		int length = 5;
		int numbers[];		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		length = scanner.nextInt();
		
		numbers = new int[length];
		
		//function call
		numbers = RunArrayExample.populateArray(numbers);	
		
		System.out.println("The Array is : ");
		
        for (int i = 0; i < numbers.length; i++) {
        	
        	System.out.print(numbers[i]+" ");
								
		}
		

	}

}
