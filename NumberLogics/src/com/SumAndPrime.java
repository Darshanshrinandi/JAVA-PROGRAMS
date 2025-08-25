package com;
import java.util.Scanner;

//MAKE SUM OF THE DIGITS AND CHECK THE SUM IS PRIME O NOT
public class SumAndPrime {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num = sc.nextInt();
	     int sum=0;
	     int rem;
	     while(num!=0) {
	    	rem=num%10;
	    	sum=sum+rem;
	    	num=num/10;
	     }
	     
	     System.out.println(sum);
	      int c=0;
	     for(int i=1;i<sum;i++) {
	    	 if(sum%2==0) {
	    		 c++;
	    	 }
	     }
	     if(c==2) {
	    	 System.out.println("prime Number");
	     }
	     else {
	    	 System.out.println("Not a PrimeNumber");
	     }
	   }
}
