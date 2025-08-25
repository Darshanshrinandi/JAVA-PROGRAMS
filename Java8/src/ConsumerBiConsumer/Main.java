package ConsumerBiConsumer;

import java.util.function.BiConsumer;

public class Main {
	
	public static void main(String[] args) {
		
		BiConsumer<String, Integer> res = (x,y)->{
			
			 System.out.println(x);
			 System.out.println(y);
		};
		   
		res.accept("Darshan", 23);
	}

}
