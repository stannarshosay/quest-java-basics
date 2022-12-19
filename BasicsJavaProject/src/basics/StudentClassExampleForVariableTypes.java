package basics;

//Rahul,Tanvi => object of class Student or variable of datatype Student

public class StudentClassExampleForVariableTypes {

	//instance variables
	int rollNo;
	String name;
	float marksObtained;
	
	//class/static variable
	static float totalMarks;
	
//	since a variable is final its constant and hence can be static as 
//	it's enough to have just one memory location
	static final String COLLEGE_NAME = "St.Thomas";
	
	void calculatePercentage() {		
		
		//local variable
		float percentage = 0;

		percentage = (marksObtained / totalMarks) * 100;

		System.out.println(name + ", your percentage is : " + percentage);	

	}
	
	static void printAllGrades() {
		System.out.println("S, A, B, C, D, U");
	}

	public static void main(String[] args) {
		
		// access a static variable
		StudentClassExampleForVariableTypes.totalMarks = 500;
		
		// cannot modify final variables
//		StudentClassExampleForVariableTypes.collegeName = "Hacked...";

		StudentClassExampleForVariableTypes rahul = new StudentClassExampleForVariableTypes();
		rahul.rollNo = 10;
		rahul.name = "Rahul R";
		rahul.marksObtained = 366;

		System.out.println("Roll No : " + rahul.rollNo);
		System.out.println("Name : " + rahul.name);
		System.out.println("Marks Obtained : " + rahul.marksObtained);
		System.out.println("Total Marks : " + StudentClassExampleForVariableTypes.totalMarks);
		System.out.println("College : " + StudentClassExampleForVariableTypes.COLLEGE_NAME);

		rahul.calculatePercentage();

		// END of rahul

		StudentClassExampleForVariableTypes tanvi = new StudentClassExampleForVariableTypes();
		tanvi.rollNo = 12;
		tanvi.name = "Tanvi Khan";
		tanvi.marksObtained = 400;

		System.out.println("\n\nRoll No : " + tanvi.rollNo);
		System.out.println("Name : " + tanvi.name);
		System.out.println("Marks Obtained : " + tanvi.marksObtained);
		System.out.println("Total Marks : " + StudentClassExampleForVariableTypes.totalMarks);
		System.out.println("College : " + StudentClassExampleForVariableTypes.COLLEGE_NAME);

		tanvi.calculatePercentage();

		// END of tanvi
		
		
		//PRINT ALL GRADES
		
		System.out.println("\n\n\nAll Grades");
		System.out.println("----------");
		
		StudentClassExampleForVariableTypes.printAllGrades();
	}

}
















