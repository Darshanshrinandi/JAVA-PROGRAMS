package UserDefinedExceptions;
import java.util.Scanner;

public class User {
	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	  
	   System.out.println("Please Enter your Password");
	   int password=sc.nextInt();
	   
	   if(password==452002) {
		   System.out.println("WELCOME DARSHAN :)");
	   }
	   else {
		  try {
			   throw new InvalidPasswordException("You Are Not DARSHAN :(");
		  }
		  catch(InvalidPasswordException e) {
			    System.out.println(e.getMessage());   
		  }
		   
	   }
	
}
}
