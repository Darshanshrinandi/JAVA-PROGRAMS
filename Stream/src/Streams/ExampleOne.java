package Streams;

import java.util.Arrays;
import java.util.List;

public class ExampleOne {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		//Count even numbers
		System.out.println(numbers.stream().filter(x->x%2==0).count());
		
	}
}
