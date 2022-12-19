package main;

import java.util.Scanner;

import classes.Calculator;

public class RunCalculator {

	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;
		float result;
		char operator;
		char shouldExit;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the calculator");
		System.out.println("-------------------------");

		while (true) {

			System.out.println("\n\nEnter first number : ");
			firstNumber = scanner.nextInt();

			System.out.println("Enter second number : ");
			secondNumber = scanner.nextInt();

			System.out.println("Select a operator (+,-,/,*,%)");
			operator = scanner.next().charAt(0);
			
			if((operator == '/')||(operator == '%')) {
				if(secondNumber == 0) {
					System.out.println("Cannot divide by zero");
					System.out.println("Enter second number again : ");
					secondNumber = scanner.nextInt();
				}
			}

			switch (operator) {
			case '+': {
				result = Calculator.getSum(firstNumber, secondNumber);
				break;
			}
			case '-': {
				result = Calculator.getDifference(firstNumber, secondNumber);
				break;
			}
			case '/': {
				result = Calculator.getQuotient(firstNumber, secondNumber);
				break;
			}
			case '*': {
				result = Calculator.getProduct(firstNumber, secondNumber);
				break;
			}
			case '%': {
				result = Calculator.getRemainder(firstNumber, secondNumber);
				break;
			}
			default: {
				result = 0;
			}
			}

			System.out.println("\nThe result is : " + result);
			System.out.println("Do you want continue?(Y/N)");
			shouldExit = scanner.next().charAt(0);
			
			if(shouldExit == 'N') {
				break;
			}
			
		}
		
		System.out.println("\nThank you! ");

	}

}
