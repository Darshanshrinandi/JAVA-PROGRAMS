package Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//No insertion Oder
		//No Sorted Oreder
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(22);
		set.add(20);
		set.add(100);
		set.add(01);
		
		for(Integer i:set) {
			System.out.println(i);
		}
		
	}

}
