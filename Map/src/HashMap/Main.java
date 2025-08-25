package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(1, "darshan");
		students.put(2, "ammu");
		students.put(3, "adarsh");
		students.put(4, "karthi");
		
		//First we need to convert this into set
		System.out.println(students.containsKey(3));
		System.out.println(students.containsValue("Darshan"));
		
		//Iterating Map using keySet() Method
		Set<Integer> std =  students.keySet();
		
		for( Integer i:std) {
			System.out.println(students.get(i));
		}
		
		//Iterating usig entrySet() method
		
		  Set<Map.Entry<Integer, String>> entries=students.entrySet();
		  
		  for(Map.Entry<Integer,String> i:entries) {
			  
			      i.setValue(i.getValue().toUpperCase());
			      System.out.println(i.getKey()+": "+i.getValue());
			
			  }
		    
		
          students.put(5, "Dhanush");
		
		  students.remove(4);
		  
		System.out.println(students);
		
		
		  
		   
	}

}
