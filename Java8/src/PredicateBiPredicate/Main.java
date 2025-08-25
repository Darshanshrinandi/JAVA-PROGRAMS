package PredicateBiPredicate;

import java.util.function.BiPredicate;

public class Main {
	public static void main(String[] args) {
		
		//CHECK CONDITION AND RETURNS TRUE OR FALSE 
		BiPredicate<Integer, Integer> res = (x,y)-> (x+y)%2==0;
		   System.out.println(res.test(5, 5));
	}

}