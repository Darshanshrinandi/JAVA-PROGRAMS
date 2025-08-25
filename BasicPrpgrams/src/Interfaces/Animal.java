package Interfaces;

public interface Animal {

	    static  int age=14;
	    
	   public void eat();
	   
	   public void sleep();
	   
	   public static void run() {  //WE CAN WRITE STATIC MEHTODS INSIDE THE INTERFACE
		   
		   System.out.println("All Animal can run.");
	   }
	   
	   public default String info(String info ) { // WE CAN WRITE DEFAULT METHOD ALSO INSIDE INTERFACE
		   return "This is infromation about "+info;
	   }
	   
	   
}
