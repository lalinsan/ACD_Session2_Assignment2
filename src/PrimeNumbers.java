/*
 * Student: Eduardo Aguirre
 * Session 2
 * Assignment 2
 * Java program that generates prime numbers for a given number between 1 and 100 using for loop. A prime number (or a prime) is a
 * natural number greater than 1 that has no positive divisors other than 1 and itself. A natural
 * number greater than 1 that is not a prime number is called a composite number. Takes the number enter by the User and calculates the Prime numbers 
 * between 1 and the provided number.
 */


//Imports the Scanner Class from Java API Library, to allows User's Input
import java.util.Scanner;

public class PrimeNumbers
{
   public static void main (String[] args) //Main Method to run the Program
   {		
       int i =0; //Variable used by the Loop
       int num =0; //Variable used by the Loop
       
       //String to hold and print the Prime Numbers. Initialized to a empty String
       String  primeNumbers = "";
       
      
       @SuppressWarnings("resource")
       //Initiates the Scanner Instance
       Scanner sc = new Scanner(System.in);
       
       //Prompts user to enter a Number between 1 and 100
       System.out.print("Enter a number between 1 and 100: ");
       int choice =sc.nextInt();
       
       //Validates that the number entered by the user is greater than 1 and lower than 100 to restrict to number between 1 and 100
       if (choice<1 || choice >100)
       {
    	   System.out.println("Invalid Number"); //If the number entered is not between 1 and 100 displays an error
       }
       else 
       {
    	   for (i = 0; i <= choice; i++)  //Initializes i  to 0, set the Condition to execute the Loop as long as i is <= than the number provided by the user, increments i by 1     
           { 		  	  
              int counter=0; //Sets a counter to 0	  
              for(num =i; num>=1; num--)  //Initializes variable num to the value of i, set the Condition to execute the Loop as long as num >= than 1, decrements num by 1
    	      {
                 if(i%num==0) //if the remainder of variable i = 0 the sets the counter variable to counter +1
                	 
    	      {
     		   counter = counter + 1;
    	     }
    	   }
    	  if (counter ==2) //counter ==2 
    	  {
    	     // Appends the Prime Number to the empty Prime Number String
    	     primeNumbers = primeNumbers + i + " ";
    	  }	
           }	
    	   System.out.println("=================================");
    	   System.out.println("You entered number :" + choice);
    	   System.out.println(""); //Adds blank space
    	   System.out.println("Prime numbers between 1 and " +choice + " are:"); //Displays message to show the Prime Numbers
           System.out.println(primeNumbers);   //Displays the Prime Number between 1 and provide number
       }
       
   }
}
