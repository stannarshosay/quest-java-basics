package controlflow;

public class ForLoopStatement {

	public static void main(String[] args) {
		
		
		//Calculate the sum of n numbers
		//Using Loops
		
		int sum = 0;  //1+2+3+.....10
		int n = 10;
		
		
		for(int i = 1; i<=n; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println("Using For Loop sum of "+n+" numbers is "+sum);
		
		
		//Calculate the sum of n numbers
		//Using Algorithm
		
		sum = 0;
		
		sum = (n*(n+1))/2;
		
		System.out.println("Using algorithmn sum of "+n+" numbers is "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
