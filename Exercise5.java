//DoWhile2.java
/*This program presents the user with a menu containing 3 options. The user can select
 *any of the 3 options and a different course of action takes place with each choice. A do-while
 *loop is used for the iteration process and a switch for the menu selection process*/
 
 import java.util.Scanner; 
 	
 public class Exercise5 {
 	public static void main(String args[])
 	{
 		String menuText = "\n\n\t1. Convert Fahrenheit to Celcius\n\t2. Convert Celcius " +
 			"to Fahrenheit\n\t" + "3. Convert Kelvin to Celcius\n\t" + "4. Quit\n\nPlease enter your choice: ";
 			
 			
 		int choice;
 		float celcius, fahrenheit, kelvin;
 		
 	
 		Scanner input = new Scanner(System.in);
 		
 		do
 		{
 			System.out.print(menuText);
 			choice = input.nextInt();
 			
 		while(choice>= 1 || choice <=4)
 		   { 
 		   	
 		  System.out.println("Invalid choice - must be 1,2,3 or 4. Please re-enter");
 		  
 	     	}
 		
 			switch(choice)
 				
 			{
 				case 1: 
 					System.out.print("Please enter a temperature in Fahrenheit: ");
 					fahrenheit = input.nextFloat();
 					
 					celcius = (fahrenheit - 32) * (5f/9);
 					
 					System.out.println(fahrenheit + "F" + " is " + 
 						"equivalent to " + String.format("%.2f", celcius) + "C");
 						
 					break; 
 						
 					
 				
 				case 2: 
 					System.out.print("\nPlease enter a temperature in Celcius: ");
 					celcius = input.nextFloat();
 					
 					fahrenheit = (9/5f)*celcius + 32;
 					
 					System.out.println(celcius + "C" + " is " +
 					"equivalent to " + String.format("%.2f", fahrenheit) + "F");
 					
 					break;
 					
 				case 3: 
 					System.out.print("Please enter a temperature in Kelvin: ");
 					kelvin = input.nextFloat();
 					
 					celcius = kelvin - 273;
 					
 					System.out.println(String.format("%.1f", kelvin) + "K" + " is equivalent to " + celcius + "C");
 					
 					break;
 					
 				case 4 :
 					System.out.println("Thanks for using the system .... goodbye");
 			}
 		} while(choice !=3);
 		
 	}
 }