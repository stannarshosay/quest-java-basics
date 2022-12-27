package main;

public class RunSmallestNumberInArray {
	
	
	public static int findSmallest(int numbers[]) {
		
		int smallestNumber = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			
			if(smallestNumber > numbers[i]) {
				
				smallestNumber = numbers[i];
				
			}
				
		}
		
		return smallestNumber;
		
	}

	public static void main(String[] args) {
		
		int numbers[] = new int[] { 11, 33, 2, 456, 55 };

		System.out.println("The array is : ");

		for (int number : numbers) {
			System.out.print(number + "  ");
		}

		int smallest = RunSmallestNumberInArray.findSmallest(numbers);

		System.out.println("\nThe smallest number is : " + smallest);


	}

}
