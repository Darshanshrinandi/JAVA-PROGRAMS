package MethodReference;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		  List<String> students =Arrays.asList("Darshan","Ammu","Adarsh");
		  
		     students.forEach(System.out::println);
		     
		   //Constructer Reference
		    
		  List<String> mobiles =Arrays.asList("Iphone","MI","Vivo");
		  List<Phones> phones=mobiles.stream().map(Phones::new).collect(Collectors.toList());
		  
		     phones.forEach(x->System.out.println(x));
		    
		   
		     
		     
		     
	}

}

class Phones{
	
	String name;
	
	Phones(String name){
		this.name=name;
		}
	
}
