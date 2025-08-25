package com;
// MAX NUMBER IN AN ARRAY
public class ProgramTwo {
  public static void main(String[] args) {
	
	     int [] arr= {1,4,6,99,4544,56};
	     
	      int max =arr[0];
	     
	     for(int i=0;i<arr.length;i++) {
	    	
	    	 if(arr[i]>max) {
	    		 max=arr[i];
	    	 }
		     
	     }
	     System.out.println(max);
}
}
