package LinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

 

public class LinekdListDemo {
	
	public static void main(String[] args) {
		 Queue<Integer> q = new LinkedList<Integer>();
		      q.offer(2);
		      q.offer(3);
		      q.offer(4);
		      q.offer(29);
		      
		      System.out.println(q);
		      
		     q.remove();//throws exception if queue is empty
		     q.poll();//give null if queue is empty
		     
		     System.out.println(q.size());
		     System.out.println(q);
		     
		     
		     Queue<Integer> q1 = new ArrayBlockingQueue<>(2);
		         
		     q1.offer(2);
		      q1.offer(3);
		      
		      q.offer(9);
		      System.out.println(q1.offer(9));//Gives false if capacity is full
		      System.out.println(q1.add(3));//Throws exception if capacity is full
		   
		     	}

}
