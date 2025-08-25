package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	
	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		
		//Collector
		System.out.println(num.stream().filter(x->x%2==0).collect(Collectors.toSet()));
		
	   //forEach
		num.stream().forEach(x->System.out.println(x));
		
	  //reduce:Combines elements to produce single element
		Optional<Integer> n=num.stream().reduce((x,y)->x+y);
		Optional<Integer> n1=num.stream().reduce((Integer::sum));
		System.out.println(n.get());
		System.out.println(n1.get());
		
		
	  //anyMacth,nonMatch,allMatch
		boolean b1 = num.stream().anyMatch(x->x%2==0);
		System.out.println(b1); //returns true if any one of the number is odd
		
		boolean b2 = num.stream().allMatch(x->x>0);
		System.out.println(b2);//returns true if all the number is greater than zero
		
		boolean b3 = num.stream().noneMatch(x->x<0);
		System.out.println(b3);//returns true if all numbers are less than zero
		
	  //peek
		//Same as forEach
	 //Performs an action an each element as it is consumed
	   Stream.iterate(1, x-> x+1).limit(200).peek(System.out::println).count();
	   
	   
	 //.toArray:Converts list as array
	  Object[] array =Stream.of(1,2,4,5).toArray();
	 
	//max/min
	  
	 List<Integer> nm = Arrays.asList(1,2,3,33,44,55);
	 System.out.println("Max :"+  nm.stream().peek(x->System.out.println(x)).max((x,y)-> x -y).get());
	  
    System.out.println("Min: "+	  nm.stream().peek(x->System.out.println(x)).min(Comparator.naturalOrder()).get());
	  
    
    //forEachOrderd:Used for parallel stream and it is orderd
      System.out.println("using for Parallel Stream");
      List<Integer> numbers = Arrays.asList(1,2,3,4,2,3,2,2,4,5,3);
      numbers.parallelStream().forEachOrdered(System.out::println);
	  
	}

}
