package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	 
	     public static void main(String[] args) {
			
	    	 List<Student> s=new ArrayList<>();
	    	 
	    	 s.add(new Student("Darshan",9.3));
	    	 s.add(new Student("Ammu",9.9));
	    	 s.add(new Student("Dhanush",8.4));
	    	 s.add(new Student("Amith",9.3));
	    	
	    	 //LAMBDA EXPRESSION
//	    	 s.sort((a,b)->{
//	    		 if(b.getGpa() - a.getGpa()>0)
//	    		 {
//	    			 return 1;
//	    		 }
//	    		 else if(b.getGpa() - a.getGpa()<0)
//	    		 {
//	    			 return -1;
//	    		 }
//	    		 else {
//	    			 return a.getName().compareTo(b.getName());
//	    		 }
//	    		 
//	    	 });
	    	 
	    	 //JAVA 8 CONCEPT EASY WAY
Comparator<Student> students= Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);	    	 
   
                   s.sort(students);
             for(Student std:s) {
            	 
            	 System.out.println(std.getName()+"  "+std.getGpa());
             }      
	    	 
     	    	 
		}
}


