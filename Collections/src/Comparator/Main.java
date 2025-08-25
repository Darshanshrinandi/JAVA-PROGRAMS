package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//COMPARATOR IS AN INTERFACE PRESENT IN JAVA.UTIL PACKAGE WHERE WE NEEDS TO IMPLEMENT IN EXISTING CLASS

    class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
	   return o1 -o2;//FOR ASSENDING ORDER
//	   return o2 -o1;//FOR DECESING ORDER
	}
	
}  
   
   class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		  return o1.length() - o2.length();
	}
	   
   }



public class Main{
	 public static void main(String[] args) {
		 
		 List<Integer> l1=new ArrayList<Integer>();
		 
		 l1.add(22);
		 l1.add(1);
		 l1.add(39);
		 
		 l1.sort( new MyComparator());
		 
		 System.out.println(l1);
		 
		 List<String> l2 = new ArrayList<String>();
		 l2.add("Apple");
		 l2.add("Banana");
		 l2.add("Graps");
		 
		 l2.sort(new StringComparator());
		 System.out.println(l2);
		 
	}
}
