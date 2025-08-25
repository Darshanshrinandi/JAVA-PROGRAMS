package Set;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new CopyOnWriteArraySet<Integer>();
		   
		for(int i =0;i<=6;i++) {
			set.add(i);
		}
		
		 System.out.println("Iterating and modifing");
		   for(int i :set) {
			   
			  
			   set.add(7);
			   System.out.println(i);
		   }
		   
		   System.out.println("After modiftying");
		   
		   System.out.println(set);
	}

}
