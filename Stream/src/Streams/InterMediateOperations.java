package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InterMediateOperations {

	public static void main(String[] args) {
		
		 
		//filter() Method
 		List<String> names=Arrays.asList("Ammu","Darshan","Adarsh");
		
		 Stream<String> filterdStream = names.stream().filter(x->x.startsWith("A"));
		 
		 long res = filterdStream.count();
		 System.out.println(res);
		 
		
        System.out.println(	names.stream().map(String::toUpperCase).count());
        
        //sorted
        
        List<String> s=names.stream().sorted().toList();
        System.out.println(s);
	   
       //distinct
        System.out.println(names.stream().filter(x->x.startsWith("A")).distinct().count());
        
       //limit
        System.out.println(Stream.iterate(1,x->x+1).limit(100).count());
        
       //skip
        System.out.println(Stream.iterate(1, x->x+1).skip(10).count());
       
		 
		 
		 	
		 
		
	}
}
