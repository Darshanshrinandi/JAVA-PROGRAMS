package EnumMap;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnumMapDemo {
	
	public static void main(String[] args) {
		//ARRAY OF SIZE SAME AS ENUM
		//NO HASHING OR NO GENERATING OF HASHCODE
		//INDEX IS BASED ON ENUM INDEX
		//ODINAL/INDEX USED
		//FASTER THAN HASHMAP
		//MEMORY EFFICIENT
		Map<Day,String> map = new EnumMap<Day, String>(Day.class);
		
		  map.put(Day.MONDAY,"Gym");
		  map.put(Day.SUNDAY, "Party");
		  
		   System.out.println(Day.SATURDAY.ordinal());
		   
		   
		   //SORTED ORDER PR ENUM ORDER
		   for(Entry<Day, String> days:map.entrySet()) {
			    System.out.println(days.getKey()+": "+days.getValue());
		   }
		
	}

}

  enum Day{
	
	   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
