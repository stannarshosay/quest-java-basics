package basics;

public class TypeCasting {

	public static void main(String[] args) {
		
		String variableInNeedOfTypeCasting = "false";
		
		int x = 100;
		Integer a = 250;
		
		//convert primitive to wrapper or non primitive => autoboxing
//		x=a;
		//convert wrapper or non primitive to primitive => unboxing
//		a=x;
		
//		int convertedVariable = Integer.parseInt(variableInNeedOfTypeCasting);		
//		System.out.println(convertedVariable + 50);
		
		
//		float convertedVariable = Float.parseFloat(variableInNeedOfTypeCasting);		
//		System.out.println(convertedVariable + 50.3);
		
		
		boolean convertedVariable = Boolean.parseBoolean(variableInNeedOfTypeCasting);	
		if(convertedVariable) {
			System.out.println("Yes its true");
		}else {
			System.out.println("Oops! its false");
		}
		
		
//		String y = String.valueOf(x);
//		String y = x + "";
		String y = a.toString();
		System.out.println(y);
		
		float b = a;
		System.out.println(b);		

	}

}
