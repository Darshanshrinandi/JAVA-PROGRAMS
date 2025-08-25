package com;



public class Divison {
	public static void main(String[] args) {
		
	
	
	   int x=20;
	   int y=0;
	   
	   try {
		   
		   int res = x/y;
		   
		   System.out.println(res);
		   
	   }
	   catch(ArithmeticException e) {
		  
		    System.out.println("You can not divide a number by zero");
	   }
}
}
