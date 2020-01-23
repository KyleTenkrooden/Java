//Exercise2.java
/*This program prompts a user to enter their username and password 
 *and uses a counter-while loop to terminate the process if over 3 attempts 
 *have been made*/
 
 import java.util.Scanner; 
 	
 public class Exercise2{  
 	public static void main(String args[])
 	{
 		final String Username = "t00012345", Password = "java";
 		String UsernameAttempt = " ", PasswordAttempt = " ";
 		int count=0; 
 	
 	    Scanner input = new Scanner(System.in);
 	    
 	    while(count < 3)		
 	    { 
 	    	System.out.print("Please enter your username: ");
 	    	UsernameAttempt = input.nextLine(); 
 	    		
 	    	System.out.print("Please enter your password: ");
 	    		UsernameAttempt = input.nextLine(); 
 	    			
 	    			
 	    	if ((!UsernameAttempt.equals(Username) || !passwordAttempt.equals(Password)) && count<2)
 	    		System.out.println("Invalid username/password combination. 2 attempts remaining")
 	    			
 	    	else if ((!UsernameAttempt.equals(Username) || !passwordAttempt.equals(Password)) && count<2)
 	    		System.out.println("Invalid username/password combination. 1 attempts remaining")
 	    	else
 	    		System.out.println("Welcome to the system!")
 	            
 	            
 	        count++;
 	
 	    }	
 	
 	
 	
 	
 	}
 	
 
 
 	