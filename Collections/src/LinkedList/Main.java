package LinkedList;
import java.util.Arrays;
import java.util.LinkedList;


public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		    l.add(2);
		    l.add(4);
		    l.add(1);
		    l.add(5);
		    l.add(11);
		    l.addFirst(10);
		    l.addLast(39);
		    
		    System.out.println(l.indexOf(2));
		    System.out.println(l.lastIndexOf(5));
		    
		   System.out.println(l);
		   
		   l.removeIf(x->x%2==0);//LAMBDA EXPRESSION INSIDE THAT CONDITION
		   System.out.println(l);
		   
		   LinkedList<String> animals= new LinkedList<String>(Arrays.asList("Tiger","Dog","Bull","cat"));
		   LinkedList<String> removeAnimals=new LinkedList<String>(Arrays.asList("dog","cat"));
		    animals.removeAll(removeAnimals);
		    
		    System.out.println(animals);
	}

}
