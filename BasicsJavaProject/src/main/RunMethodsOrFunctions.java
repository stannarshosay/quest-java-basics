package main;

public class RunMethodsOrFunctions {
	
	
	static boolean sendEmailToUser(String email,String name){
		
		System.out.println("Inside \"function\" sendEmailToUser()\nname : "+name+"\nemail : "+email+"\n\n\n");

		
		/*  
		 * 
		 *  Some code to send mail to the email address stored in parameter/argument - email 
		 *  to the user named (stored in parameter/argument - name)
		 *  
		 *  
		 *  based on some logic the function can actually realize
		 *  whether an email is sent or not
		 *  
		 *  and hence the function is able to send some data back or return
		 *  some data back stating whether the functionality was successfully completed
		 *  		 
		 */
			
		return true;
		
		
	}
	

	public static void main(String[] args) {
		
		
		boolean hasEmailSendSuccessfully;
		
				
		hasEmailSendSuccessfully = sendEmailToUser("stannarsjose@gmail.com","Stannars");
		
		if(hasEmailSendSuccessfully) {
			System.out.println("Hurray! Email has been sent successfully.");
		}else {
			System.out.println("Oops! Something went wrong.");
		}
		
		
		

	}

}
