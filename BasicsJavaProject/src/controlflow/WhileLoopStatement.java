package controlflow;

public class WhileLoopStatement {
	
	public static void main(String[] args) {
		
		//Calculate the sum of n numbers
				
		int sum = 0;  //1+2+3+.....10
		int n = 10;		
		
        int i = 1;
		
		while(i<=n) {
			
			sum = sum + i;
			i++;
			
		}
		
		System.out.println("Using While Loop sum of "+n+" numbers is "+sum);
		
		
		
		//Infinite loop
		
		int j = 0;
		
		while(true) {
			System.out.println("Hello Guys "+j);
			j++;
		}	
		
		
		
	}

}
