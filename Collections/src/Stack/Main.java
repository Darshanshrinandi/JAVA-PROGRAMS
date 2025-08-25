package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Stack<Integer> s= new Stack();
		 s.push(1);
		 s.push(2);
		 s.push(5);
		 s.push(10);
		 s.push(0);
		 s.push(11);
		 
		 System.out.println(s);
		
//		s.remove(2);
//		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		
		
		
		int search = s.search(10); 
		System.out.println(search);
		
		
		//Linkedlist as stack
		
		LinkedList<Integer> l= new LinkedList<Integer>();
		l.addLast(10);
		l.addLast(11);
		l.addLast(12);
		l.addLast(13);
		l.addLast(14);
		
		System.out.println(l);
		
		l.getLast();//peek
        l.removeLast();//pop
		
		
		
		
		
	}

}
