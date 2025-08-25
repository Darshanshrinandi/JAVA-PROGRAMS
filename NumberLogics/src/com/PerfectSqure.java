package com;
import java.util.Scanner;
//TO CHECK THE GIVEN NUMBER IS PERFECT SQURE
public class PerfectSqure {
  public static void main(String[] args) {
	
	  int num;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number");
	   num=sc.nextInt();
	   
	   
	   boolean flag=false;
	   for(int i=1;i<=num;i++) {
		   if(i*i==num) {
			   flag = true;
		   
		   }
	   }
	   
	   if(flag==true) {
		   System.out.println("Perfect Squre");
	   }
	   else {
		   System.out.println("Not a perfect Squre");
	   }
	  
}
}
