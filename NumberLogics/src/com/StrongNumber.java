package com;
import java.util.Scanner;

//STRONG NUMBER
public class StrongNumber {

	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		 int rem ,sum=0;
		 int duplicate=num;
		
		 
		 while(num!=0) {
			 rem = num%10;
		     int fact=1;
		   for(int i=1;i<=rem;i++) {
			   fact=fact*i;
		   }
		   sum = sum+fact;
			 num =num/10;
		 }
		 
		 if(sum==duplicate) {
			 System.out.println("Strong Number");
		 }
		 else {
			 System.out.println("Not a Strong Number");
		 }
	
	  }
}
