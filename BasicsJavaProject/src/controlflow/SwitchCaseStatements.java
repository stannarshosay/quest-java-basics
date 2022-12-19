package controlflow;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		char grade = 'K';
		
		switch(grade) {
			case 'S' :
			case 'A':{
				System.out.println("Very Good");
				break;
			}
			case 'B':{
				System.out.println("Good");
				break;
			}
			case 'C':{
				System.out.println("Average");
				break;
			}
			case 'D':
			case 'E':
			case 'F':{
				System.out.println("Unqualified");
				break;
			}
			default:{
				System.out.println("Invalid Input");
			}	
		}
		
		
	}

}
