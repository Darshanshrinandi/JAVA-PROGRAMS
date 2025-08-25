package com;

public class Example {

	public static void main(String[] args) {
		int [] numarator= {22,44,56,23};
		int [] denominator= {2,3,0,6};
		
		for(int i=0;i<numarator.length;i++) {
			
			try {
				divide(numarator[i],denominator[i]);
				
			}
			catch (Exception e) {
				System.out.println("You can not divide a number by Zero");
			}
		}
	}
	
	
	public static void divide(int a, int b) {
		System.out.println(a/b);
	}
}
