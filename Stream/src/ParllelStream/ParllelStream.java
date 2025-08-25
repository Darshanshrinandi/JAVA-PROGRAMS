package ParllelStream;

import java.util.List;
import java.util.stream.Stream;

public class ParllelStream {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		List<Integer> list =Stream.iterate(1, x-> x+1).limit(2000).toList();
		List<Long> factorial = list.stream().map(ParllelStream::fact).toList();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken with Sequential stream "+ (endTime - startTime)+" ms");
		
		long startTime1 = System.currentTimeMillis();
		List<Integer> list1 =Stream.iterate(1, x-> x+1).limit(2000).toList();
		List<Long> factorial1 = list1.parallelStream().map(ParllelStream::fact).toList();
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken with Sequential stream "+ (endTime1 - startTime1)+" ms");
		
		
	}
	
	private static long fact(int n) {
		 long res =1;
		 for(int i =1;i<=n;i++) {
			 res = res*i;
		 }
		 return res;
	}

}
