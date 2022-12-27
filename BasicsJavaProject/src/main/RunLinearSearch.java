package main;

public class RunLinearSearch {

	public static int search(int term, int numbers[]) {

		for (int i = 0; i < numbers.length; i++) {

			if (term == numbers[i]) {

				return (i + 1);

			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int numbers[] = { 25, 23, 55, 6, 88, 95 };

		int position = RunLinearSearch.search(884, numbers);

		if (position > -1) {
			System.out.println("Element found at position : " + position);
		} else {
			System.out.println("No element found!");
		}

	}

}
