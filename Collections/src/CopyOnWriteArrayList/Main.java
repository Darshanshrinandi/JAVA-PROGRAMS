package CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	public static void main(String[] args) {
		
		List<String> food = new CopyOnWriteArrayList<String>();
		     food.add("Milk");
		     food.add("Bread");
		     food.add("Egg");
		     
		     System.out.println("Initial list");
		     System.out.println(food);
		     
		     for(String item:food) {
		    	  
		    	 if(item.equals("Egg")) {
		    		 food.add("Butter");
		    	 }
		     }
		     
		     System.out.println("Updated List");
		     
		     System.out.println(food);
		
	}

}
