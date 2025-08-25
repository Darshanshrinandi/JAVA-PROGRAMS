package UserDefinedExceptions;
import java.util.Scanner;

public class PersonAge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		System.out.println("Enter Your Gender");
		String gender=sc.next();
		
		
		if(age>=21 && gender.equals("male") || age>=18 && gender.equals("female")) {
			
			System.out.println("You Are eligible for Marriage :)");
			
		}
		else {
			try {
				throw new AgeInvalidException("You Are not Eligible for Marriage");
			}catch(AgeInvalidException a) {
				   System.out.println(a.getMessage());
				
			}
		}
		
		
	}

}
