package Collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ExampleOne {

	public static void main(String[] args) {
		
		//Collecting names By length
		
		List<String> name = Arrays.asList("Darshan","Adarsh","Ammu");
		      name.stream().collect(Collectors.groupingBy(x->x.length()));
		      
		//Counting Word Occurences
		  String str = "Hello bro Hello bye bye bro";
          System.out.println( Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));
          
        //Summing values in a map
          Map<String, Integer> fruts = new HashMap<String, Integer>();
          fruts.put("Apple", 250);
          fruts.put("Mango", 200);
          fruts.put("Graps", 210);
          fruts.put("Banana", 25);
          
         System.out.println( fruts.values().stream().collect(Collectors.summarizingInt(x->x)).getSum());
                      //OR
         System.out.println(fruts.values().stream().reduce(Integer::sum));
         
         //Creating map from stream elements
         
         List<String> list =Arrays.asList("Lion","tiger","Cheeta");
        System.out.println(list.stream().collect(Collectors.toMap(x->x.toUpperCase(), x->x.length())));
         
          
	}
}
