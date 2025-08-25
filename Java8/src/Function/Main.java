package Function;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		
		Function<Integer,Integer> doubleIt = x->2*x;
		System.out.println(doubleIt.apply(20));
		
		Function<Integer,Integer> tripleIt = x->x*3;
		  System.out.println(tripleIt.apply(20));
		  
		System.out.println(doubleIt.andThen(tripleIt).apply(100));
		//100*2=200 andThen 200*3=600
		
		System.out.println(tripleIt.andThen(doubleIt).apply(100));
		//100*3=300 andThen 300*2=600
		
		System.out.println(doubleIt.compose(tripleIt).apply(100));
		
	}

}
