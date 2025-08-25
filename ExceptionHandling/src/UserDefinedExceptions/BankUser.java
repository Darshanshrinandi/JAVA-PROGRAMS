package UserDefinedExceptions;
import java.util.Scanner;

public class BankUser {
	
	public static void main(String[] args) {
		
		double balance=5000;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Withdrwal Amount");
		double amount = sc.nextDouble();
		 if(amount<=balance) {
			 System.out.println("Withdrwal Successfull");
			 balance-=amount;
			 System.out.println("your balance is "+balance);
		 }
		 else {
			 try {
				 throw new InsufficinentBalanceException("Low Balance");
			 }catch(InsufficinentBalanceException e) {
				 System.out.println(e.getMessage());
			 }
		 }
		
		
		
	}
	
	

}
