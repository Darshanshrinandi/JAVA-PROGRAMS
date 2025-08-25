package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		  list.add(2);
		  list.add(10);
		  list.add(11);
		  list.add(43);
		  list.add(38);
		  
//		  for(Integer i:list) {
//			  if(i%2==1) {
//				  list.remove(i);  //THIS IS WILL GIVE ERROR BECOUSE we can not modify while reading
//			  }
//		  }
		  
		  //To resolve this problem we use ITERATOR interface
		  
		  Iterator<Integer> itr = list.iterator();
		  
		  while(itr.hasNext()) {
			  Integer i = itr.next();
			  if(i%2==1) {
				  itr.remove();
			  }
		  }
		  
		  System.out.println(list);
	}

}
