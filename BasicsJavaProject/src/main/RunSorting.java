package main;

public class RunSorting {

	public static int[] selectionSort(int numbers[]) {

		for (int i = 0; i < numbers.length - 1; i++) {

			int positionOfSmallestNumber = i;
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[positionOfSmallestNumber]>numbers[j]) {
					
					positionOfSmallestNumber = j;
					
				}
				
			}
			
			// swapping elements 
			
			int temp = numbers[i];
			numbers[i] = numbers[positionOfSmallestNumber];
			numbers[positionOfSmallestNumber] = temp;
			
		}

		return numbers;

	}
	
	public static int[] bubbleSort(int numbers[]) {

		// i determines the cycles 
		//=> bubble sort is such that it demands no of cycles which is = length of array
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < (numbers.length-1)-i; j++) {
				
				if(numbers[j]>numbers[j+1]) {
					
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					
				}
				
			}
			
		}

		return numbers;

	}

	public static void main(String[] args) {

		int numbers[] = new int[] { 11, 2, 33, 456, 55 };

		System.out.println("The initial array is : ");

		for (int number : numbers) {
			System.out.print(number + "  ");
		}

//		int sortedNumbers[] = RunSorting.selectionSort(numbers);
		int sortedNumbers[] = RunSorting.bubbleSort(numbers);


		System.out.println("\nThe sorted array is : ");

		for (int number : sortedNumbers) {
			System.out.print(number + "  ");
		}

	}

}
