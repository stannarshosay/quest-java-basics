package controlflow;

import java.util.Scanner;

public class ControlFlowExampleWithContinueAndBreak {

	public static void main(String[] args) {

		// Invalid input;

		char shouldBreak = 'N';
		char shouldContinue = 'Y';
		String name = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello User!");
		System.out.println("-----------");

		while (true) {			
			
			System.out.println("\n\nEnter you name : ");			
			name = scanner.next();			
			
			System.out.println("Your name is in uppercase is : "+name.toUpperCase());			
			System.out.println("Do you want to try another name?(Y/N)");
			shouldContinue = scanner.next().charAt(0);
			if(shouldContinue == 'Y') {
				continue;
			}

			System.out.println("Do you want to exit?(Y/N)");
			shouldBreak = scanner.next().charAt(0);
			if (shouldBreak == 'Y') {
				break;
			}

		}
		
		System.out.println("See You Again!");

	}

}
