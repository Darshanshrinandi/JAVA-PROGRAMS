package com;
//HOW MANY TIMES 10 OCCEURD
public class ProgramThree {

	public static void main(String[] args) {
		
		int [] arr = {10,2,10,33,44,10,10,10};
		
		int count=0;
		
		for(int i =0;i<arr.length;i++) {
			  if(arr[i]==10) {
				  count++;
			  }
		}
		
		System.out.println(count);
	}
}
