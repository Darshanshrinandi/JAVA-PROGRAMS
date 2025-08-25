package ImmutableMap;

import java.util.Map;

public class ImmutableMapDemo {

	 public static void main(String[] args) {
		
		 //To create an ImmutableMAp we need to use Map.of() Method
		 //WE CAN NOT MODIFY ONCE A MAP IS CREATED
		 //Only limited for 10 key-value pairs
		 Map<String,Integer> map = Map.of("Darshan",23,"Ammu",22,"Adarsh",19);
		 
		 System.out.println(map);
		 
//		 map.put("Dhanush", 24);//throws Exception
		 
		 //To over come of 10 pairs storing of Map.of() we can use Map.ofEntries() Method
		 //Where We can store n no of key- value Pairs
		 
		 Map<String ,Integer> map2 = Map.ofEntries(Map.entry("Darshan",23),Map.entry("Ammu",22));
		 
		System.out.println(map2);
	}
}
