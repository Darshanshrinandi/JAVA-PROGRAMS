package Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		//Sorted order
		
		Set<String> set = new TreeSet<String>();
		   set.add("Darshu");
		   set.add("Ammu");
		   set.add("Adarsh");
		   
		   for(String s:set) {
			   System.out.println(s);
		   }
		   
		   System.out.println(set.contains("Ammu"));
		     set.remove("Adarsh");
		     
		     System.out.println(set);
		     set.clear();
		     System.out.println(set.isEmpty());
		     
		   //for Thread Safety we can use ConcureentSkipList
		     
		   ConcurrentSkipListSet<Integer> con =new ConcurrentSkipListSet<Integer>();
		   
		   //For Unmodifiable Set we can Set.of()
		   //We can store n of values
          
		   Set<Integer> set2 = Set.of(1,2,3,2,1,3,4,2,2,2,34,4,4,0);
	}

}
