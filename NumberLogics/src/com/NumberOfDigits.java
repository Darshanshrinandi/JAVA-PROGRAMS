package com;
import java.util.Scanner;

//CHECK HOW MANY DIGITS IN A NUMBER

public class NumberOfDigits {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int num = sc.nextInt();
	   
	   int count = 0;
	   
	   while(num!=0) {
		  num=num/10;
		  count++;
	   }
	   
	   System.out.println(count);
}
}
