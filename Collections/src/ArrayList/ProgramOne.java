package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ProgramOne {
	 public static void main(String[] args) {
		 List<Integer> a= new ArrayList(10);
		 
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40);
		  a.add(50);
		  a.add(160);
		  
		 
		 for(int i:a) {
			 System.out.println(i);
		 }
		 
	      System.out.println(a.size());
	      System.out.println("--------------------------");
	      
	      a.remove(3);
	      for(int i:a) {
				 System.out.println(i);
			 }
	      System.out.println("--------------------------");
	      a.add(3,40);
	      for(int i:a) {
				 System.out.println(i);
			 }
	      System.out.println("--------------------------");
	      a.set(4,200 );
	      for(int i:a) {
	    	  System.out.println(i);
	      }
	      
	      ArrayList<Integer> numbers = new ArrayList();
	        numbers.add(1000);
	        numbers.add(3000);
	        
	        a.addAll(numbers);//USED TO ADD ANOTHER COLLECTION 
	        a.remove(Integer.valueOf(3000));//CONVERT TO OBJECT AND REMOVES
	        
	        for(int i:a) {
	        	System.out.println(i);
	        }
	        
	     ArrayList<String> animal=new ArrayList();
	     animal.add("Lion");
	     animal.add("Tiger");
	     animal.add("Monkey");
	     
	     
	     animal.remove("Monkey");//REMOVES BY VALUE BUT NOT WORK FOR OTHER 
                                
	     
	     System.out.println(animal);
	      
	      
	     
		 
		
	}
	
	
	       
	  
	
	    
	    
	   
	
   
}
