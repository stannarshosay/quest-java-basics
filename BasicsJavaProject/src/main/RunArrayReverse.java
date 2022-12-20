package main;

public class RunArrayReverse {

	// function that uses i and j both
//	public static int[] reverse(int numbers[]) {
//		
//		int[] numbersReversed = new int[numbers.length];
//		
//		int j = numbers.length - 1;
//		
//		for(int i = 0; i < numbers.length; i++,j--) {
//			
//		  numbersReversed[j] = numbers[i];
//		  
//		}
//		
//		return numbersReversed;
//		
//	}

	// function that uses only i
	public static int[] reverse(int numbers[]) {

		int numbersReversed[] = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			
			numbersReversed[(numbers.length-1)-i] = numbers[i];
			
		}
		
		return numbersReversed;

	}

	public static void main(String[] args) {

		int numbers[] = new int[] { 11, 22, 33, 44, 55 };

		System.out.println("The initial array is : ");

		for (int number : numbers) {
			System.out.print(number + "  ");
		}

		int numbersReversed[] = RunArrayReverse.reverse(numbers);

		System.out.println("\nThe reversed array is : ");

		for (int number : numbersReversed) {
			System.out.print(number + "  ");
		}

	}

}
