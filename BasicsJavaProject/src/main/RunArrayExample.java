package main;

import java.util.Scanner;

public class RunArrayExample {

	public static void main(String[] args) {
		
		int length = 5;
		int numbers[];		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		length = scanner.nextInt();
		
		numbers = new int[length];
		
		System.out.println("Enter numbers into array");
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = scanner.nextInt();
					
		}
		

	}

}
