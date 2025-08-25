package com;
import java.util.Scanner;
//PRINT ONLY EVEN DIGITS IN THE NUMBER
public class PrintEven {
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Number");
    	int num = sc.nextInt();
    	
    	int rem;
    	while(num!=0) {
    		
    		rem=num%10;
    		
    		if(rem%2==0) {
    			System.out.println(rem);
    		}
    		num=num/10;
    	}
	}
}
