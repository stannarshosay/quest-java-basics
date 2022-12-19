package controlflow;

public class PyramidPattern {

	public static void main(String[] args) {
		
		
		
//	        1
//	     1  2  1
//    1  2  3  2  1
// 1  2  3  4  3  2  1
		
		
		int n = 5;
		
		for(int i = 1; i<=n; i++) {
			
			for(int p = 1; p <= (n-i) ; p++) {				
				System.out.print("  ");
			}
			
			for(int k = 1; k<=(i-1) ; k++) {
				System.out.print(k+" ");
			}
			
			for(int j = i; j>=1 ;j--) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		

	}

}
