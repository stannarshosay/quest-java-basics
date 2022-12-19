package main;

public class RunFinalParameters {
	
	
	public static String getDetailsWithGraceMarks(final String name,final int age,float totalMarks){
		
		totalMarks += 25;
		
		// final parameters cannot be changed or is constant
//		name += "Mister";
		
		return "Hi,"+name+" | "+age+" yrs, your marks are : "+totalMarks;
		
	}
	

	public static void main(String[] args) {
		
		
		String details = RunFinalParameters.getDetailsWithGraceMarks("Stannars",18,256);
		
		System.out.println(details);
		

	}

}
