package com;
import java.util.Scanner;
//CHECK THE GIVEN NUMBER IS PALINDROM

public class Palindrome {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int num = sc.nextInt();
	   int rev = 0,rem;
	   int duplicate=num;
	   
	   while(num!=0) {
		   rem = num%10;
		   rev=(rev*10)+rem;
		   num=num/10;
		   
	   }
	   if(rev==duplicate) {
		   System.out.println("Number is Palindrom");
	   }
	   else {
		   System.out.println("Not a Palindrom");
	   }
			   
   }
}
