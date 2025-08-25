package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		//LINKEDHASHMAP EXTENDS HASHMAP CLASS
		//BY DEFAULT INSERTION ORDER BUT WE CAN CHANGE IT BY GIVING TRUE IN CONSTRUCTER
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11,0.6f,true);//uses doubly linkedlis
		  
           map.put("Darshan", 90);
           map.put("Ammu",98);
           map.put("Adarsh",87);
           
           for(Map.Entry<String, Integer> keys:map.entrySet()) {
        	   
        	   System.out.println(keys.getKey()+": "+keys.getValue());
        	   
           }
           
           System.out.println("........................");
           
           HashMap<String,Integer> hashmap= new HashMap<>();
           LinkedHashMap<String,Integer> map1= new LinkedHashMap<String, Integer>(hashmap);
           
           hashmap.put("Mango", 109);
           hashmap.put("Apple",102);
           hashmap.put("Banana",100);
           
           for(Map.Entry<String,Integer> entry:hashmap.entrySet()) {
        	   
        	   System.out.println(entry.getKey()+": "+entry.getValue());
           }
           
     }

}


