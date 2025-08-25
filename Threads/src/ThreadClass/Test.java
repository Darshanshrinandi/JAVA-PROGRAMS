package ThreadClass;

public class Test {
	public static void main(String[] args) {
		
		//CREATE OBJECT OF WORLD CLASS
		 World w = new World();
		
	    //INVOKE START() METHOD	
		 w.start();
		 for(int i =1;i<11;i++) {
			 
			 System.out.println(i);

		 }
		 System.out.println(Thread.currentThread().getName());
	}

}
