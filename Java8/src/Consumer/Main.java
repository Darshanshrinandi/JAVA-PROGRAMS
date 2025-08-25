package Consumer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	
	public static void main(String[] args) {
		
		Consumer<Integer> print =(a)->System.out.println(a);
		     print.accept(20);
		     
           Consumer<List<Integer>> printNum =x->{
        	    for(int i:x) {
        	    	System.out.println(i);
        	    }
           };
           
          List<Integer> num = Arrays.asList(1,2,3,1,3,4,4);
              printNum.accept(num);
		 
     	}

}
