package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
	
	    public static void main(String[] args) {
			
	    	Deque<Integer> dq = new ArrayDeque<Integer>();
	    	   dq.addFirst(10);//Throws exception if it is empty
	    	   dq.addLast(20);//Throws exception if it is empty
	    	   dq.offerFirst(9);
	    	   dq.offerLast(22);
	    	   
	    	   System.out.println(dq);
	    	   
	    	   System.out.println(dq.getFirst());//Throws exception if it is empty
	    	   System.out.println(dq.getLast());
	    	   
	    	   System.out.println("'''''''''''''''''''''");
	    	   
	    	   dq.removeFirst();//Throws exception if it is empty
	    	   dq.pollLast();
	    	   
	    	   for(Integer q:dq) {
	    		   System.out.println(q);
	    	   }
		}

}
