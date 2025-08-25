package Predicate;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven=x->x%2==0;
		   System.out.println(isEven.test(10));//Returns boolean value true or false
		   
		   String res = "Darshan";
		Predicate<String> equal = x->x.equals(res);
		   System.out.println(equal.test("Darshuu"));
		 
		Predicate<String> isStartWith = x->x.startsWith("A");
		   System.out.println(isStartWith.test("Ammu"));
		   
		Predicate<String> isEndsWith= x->x.endsWith("u");
		
		  Predicate<String> and = isStartWith.and(isEndsWith);
		  System.out.println(and.test("Ammu"));
	}

}
