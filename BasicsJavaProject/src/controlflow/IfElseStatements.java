package controlflow;

public class IfElseStatements {

	public static void main(String[] args) {
		
	
//		boolean hasUserLoggedIn = true;
//		boolean isPremiumUser = true;
//		int noOfDaysLeft = 10;
//		
//		
//		if(hasUserLoggedIn) {
//			
//			System.out.println("Hi User!");
//			
//			if(isPremiumUser) {
//				
//				System.out.println("You have a gold membership!");
//				
//				if(noOfDaysLeft == 0) {
//					
//					System.out.println("You membership has expired!");
//					
//				} else {					
//					
//					System.out.println("You membership will expire in "+noOfDaysLeft+" days");
//					
//				}
//				
//			}
//			
//		} else {
//			
//			System.out.println("Please Login!");
//			
//		}
		
		

		
		char grade = 'P';
		
		if((grade == 'A')||(grade == 'S')) {
			
			System.out.println("Very Good");
			
		} else if(grade == 'B'){
			
			System.out.println("Good");
			
		} else if(grade == 'C') {
			
			System.out.println("Average");

		} else {
			
			System.out.println("Unqualified");
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
