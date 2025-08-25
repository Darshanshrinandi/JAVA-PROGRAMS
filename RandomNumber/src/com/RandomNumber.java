package com;
import java.util.Random;
public class RandomNumber {
  
	
		
	
	
  
   
    
     public	 static  void  printNum() {
    	 Random r = new Random();
    	 int number = r.nextInt(1,200);
    	 System.out.println(number);
    }
	
    public static void main(String[] args) {
		RandomNumber.printNum();
	}

}
