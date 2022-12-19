package main;

public class RunArrays {

	public static void main(String[] args) {
		
		// Collection of data's of similar datatype
		
		//[ 2 , 4 , 6 , 8 , 12 ]  => elements
		//  0   1   2   3    4   => position or index of an array
		
		// if n is the length of array then
		// index of an array ranges from 0 to n - 1
			
		int numbers[] = new int[4];
		
		// setting values to an array
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
		numbers[3] = 8;
		
		//getting the set values of an array
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		//********************************************************************
		
//		String gender[] = new String[]{"Male","Female","Others"};
		String gender[] = {"Male","Female","Others"};
		
		System.out.println(gender[0]);
		System.out.println(gender[1]);
		System.out.println(gender[2]);
		
		
		//********************TRAVERSING TO PRINT*********************************
		
		System.out.println("\n\n\n");
		
		
		//Traversing through an array
		//array of length n => printing out index
		for (int i = 0; i < gender.length; i++) {
			
			System.out.println(gender[i]);	
			
		}
		
		
		//***********************FOR EACH******************************
		
		System.out.println("\n\n\n");
		
		for(int number:numbers) {
			
			System.out.println(number);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
