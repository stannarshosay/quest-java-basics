package controlflow;

public class DoWhileStatement {

	public static void main(String[] args) {

		// Calculate the sum of n numbers

		int sum = 0; // 1+2+3+.....10
		int n = 10;

		int i = 1;

		do {

			sum = sum + i;
			i++;

		} while (i <= n);

		System.out.println("Using Do While Loop sum of " + n + " numbers is " + sum);

	}

}
