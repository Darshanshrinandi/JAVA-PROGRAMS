package FunctionBiFunction;

import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) {
		
		BiFunction<String,String,Integer> test = (x,y)->(x+y).length();
		System.out.println(test.apply("Darshan", "Ammu"));
	}
	     

}
