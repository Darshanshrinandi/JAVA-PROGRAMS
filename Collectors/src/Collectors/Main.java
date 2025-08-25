package Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		//Collecting to List
		List<String> names = Arrays.asList("Ammu","Darshan","Adarsh");
		List<String> res = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		  System.out.println(res);
		  
		//Collecting to Set
		List<Integer> nums= Arrays.asList(1,2,3,21,3,4,2);
		Set<Integer> res2 = nums.stream().collect(Collectors.toSet());
		 System.out.println(res2);
		 
		//Collecting to Sequnetial Collection
		 
		 ArrayList<String> ar =names.stream().collect(Collectors.toCollection(()->new ArrayList<>()));
		  ar.forEach(System.out::println);
		  
		//Joining Strings:Concatenats Stream elements into single stream
		String concatenateNames=names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		System.out.println(concatenateNames);
		
		//Collecting Avg
		List<Integer> n = Arrays.asList(1,2,3,4,2,4,2);
		     Double print= n.stream().collect(Collectors.averagingInt(x->x));
		     System.out.println(print);
		 
		     IntSummaryStatistics stats= n.stream().collect(Collectors.summarizingInt(x->x));
		     
		   System.out.println(stats);
		   System.out.println("MAX: "+stats.getMax());
		   System.out.println("MIN: "+stats.getMin());
		   System.out.println("COUNT: "+stats.getCount());
		   System.out.println("SUM: "+stats.getSum());
		   
		//Counting Elements
		   Long count = n.stream().collect(Collectors.counting());
		   System.out.println("count:"+count);
		   
	   //Grouping Elements
		   List<String> list = Arrays.asList("Darshan","Adarsh","Ammu","Dhanu","Nithya");
		   
		   System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));
		
		//Grouping with joining
		   System.out.println(list.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(","))));
		
	  //Grouping with Counting
		   System.out.println(list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
		   
	//Grouping and Coverting into Collections
		   
		  TreeMap<Integer, Long> tm =list.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
		  System.out.println(tm);//Converted Into TreeMap
		  
		      
	}
}
