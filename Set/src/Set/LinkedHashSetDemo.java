package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		//Maintain insertion Order
		//No sorted Order
		
		Set<Integer> set = new LinkedHashSet<>();
		 set.add(22);
		 set.add(100);
		 set.add(108);
		 set.add(101);
		 
		 for(int i :set) {
			 System.out.println(i);
		 }
	}

}
