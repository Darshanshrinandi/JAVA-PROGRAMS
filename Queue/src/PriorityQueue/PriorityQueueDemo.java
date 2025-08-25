package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<Integer>(new Sorting());//SORTED ORDER
		                  //OR
//		Queue<Integer> pq = new PriorityQueue<Integer>((a,b)-> a- b);
		   pq.offer(20);
		   pq.offer(90);
		   pq.offer(10);
		   pq.offer(60);
		   
		   System.out.println(pq);
		   
		   while(!pq.isEmpty()) {
			   System.out.println(pq.poll());
		   }
		   
		   
		   
	}

}
