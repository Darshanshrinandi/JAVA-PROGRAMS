package Interfaces;

public class Main {
	public static void main(String[] args) {
		
		  Animal dog = new Dog();
		  Animal cat = new Cat();
		  
		     dog.eat();
		     dog.sleep();
		     System.out.println(dog.info("Dog"));//default Method
		     
		     cat.eat();
		     cat.sleep();
		     cat.info("Cat");//Default Method
		     System.out.println(dog.info("Cat"));
		     
		     Animal.run();
		     
		     System.out.println(Dog.age);
		     
		     
	}

}
