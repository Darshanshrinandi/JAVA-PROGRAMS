package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//LRU:Least recently used 
public class LRUCache<K,V> extends LinkedHashMap<String, Integer> {
	
	    private int capacity;
	    
	    public LRUCache(int capacity) {
	    	 super(capacity,0.75f,true);
	    	 this.capacity=capacity;
	    	 
	    }

		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<String, Integer> eldest) {
			return size()>capacity;
		}
		
		public static void main(String[] args) {
			
			LRUCache<String,Integer> map = new LRUCache<>(3);
			
			map.put("Darshan", 100);
			map.put("Ammu", 200);
			map.put("Adarsh", 400);
			
			
			map.put("Dhanush", 100);//ADDING MORE ENTRY THAN CAPACITY SO 
			                        //IT WILL REPLACE WITH RECENLTY USED ENTRY
			for(Map.Entry<String,Integer> entry:map.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue());
			}
			
		}
	    

}
