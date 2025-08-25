package ArrayLogics;
import java.util.Scanner;

//SUM OF ELEMNTS IN AN ARRAY
public class SumOfArray {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size of the array");
	  int size = sc.nextInt();
	  
	  int []arr=new int[size];
	  System.out.println("Enter the elements of Array");
	    
	 
	  for(int i = 0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
		  
		  }
	  
	  int sum=0;
       for(int i =0;i<arr.length;i++) {
    	   sum=sum+arr[i];
    	   
       }
       
       System.out.println(sum);
       sc.close();
}
}
