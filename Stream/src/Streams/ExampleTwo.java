package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleTwo {
	
	public static void main(String[] args) {
		
	   //return name where length greater than 3
		
		List<String> names= Arrays.asList("Ammu","Darshan","Adarsh","Ash");
		 
		   System.out.println( names.stream().filter(x->x.length()>3).collect(Collectors.toSet()));
		 
	  //Squaring and sorting numbers
		   
		 List<Integer> nums = Arrays.asList(1,2,3,4);
		  System.out.println( nums.stream().map(x->x*x).sorted().toList());
		 
	 //Summing values
		  List<Integer> nums2 = Arrays.asList(1,2,3,4,5);
		  System.out.println(nums2.stream().reduce((x,y)->x + y).get());
		             //OR
		  System.out.println(nums2.stream().reduce(Integer::sum).get());
		  
	//Counting ocuuerence of Charecter
		  
		  String name="Darshan";
	       //chars() is method used to convert string as stream
		  
		  System.out.println(name.chars().filter(x->x=='a').count());
		  
		  
		  
	}

}
