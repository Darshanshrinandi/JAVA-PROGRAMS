package Abstraction;

public class Test {
    public static void main(String[] args) {
		
    	Animal dog = new Dog();
    	Animal cat = new Cat();
    	
    	   dog.setName("Leo");
    	dog.makeSound();
    	cat.makeSound();
	}
} 
