package com.example;

import com.example.InnerClass.Department;

class InnerClass {
	
	public static void run() {
		System.out.println("Running");
	}

	class Department{
		
		public int num =10;
	}
	

	
	
}
 
 public class Main{
	 	
	 public static void main(String[] args) {
		 
		 InnerClass cl= new InnerClass();
		 
		 Department dpt= cl.new Department();
		 System.out.println(dpt.num);
		  
		 InnerClass.run();
		
	}
 }
