package HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentsMain {
	
	public static void main(String[] args) {
		
		
		//INCASE OF OBJECTS
		Students s1=new Students("Darshan",101);
		Students s2=new Students("Ammu",102);
		Students s3=new Students("Darshan",101);
		
		Map<Students,Integer> map = new HashMap<>();
		map.put(s1, 90);
		map.put(s2, 98);
		map.put(s3, 90);
		
	       System.out.println("Size of the Map: "+map.size());
	       System.out.println("P1 value: "+map.get(s1));
	       System.out.println("p3 Value: "+map.get(s3));
	       
	       
	     
	       //INCASE OF NORMAL VALUES
	       
	       Map<String,Integer> fruite = new HashMap<>();
	       
	          fruite.put("Mango", 50);
	          fruite.put("Banana", 30);
	          fruite.put("Mango", 100);
	          
	          System.out.println("----------------------------------");
	          System.out.println("Size is: "+fruite.size());
	          System.out.println("First Mango rate: "+fruite.get("Mango"));
	          System.out.println("Updated Mango Rate: "+fruite.get("Mango"));
	          //HERE VALUE IS UPDATED BECAUSE OF EQUALS METHOD 
	          
	    
	       
	       
		
		
		
	}

}
