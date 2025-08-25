package RunnableInterface;

public class Test {
    public static void main(String[] args) {
		
    	//CREATE THE OBJECT OF WORLD
    	World w= new World();
    	
    	//CREATE OBJECT OF THREAD CLASS AND INSTER WORLD REFERENCE
    	Thread t= new Thread(w);
    	
    	//NOW INVOKE START()METHOD
    	 t.start();
    	 
    	for(int i=1;i<11;i++) {
    		
    		System.out.println(i);
    	}
    	
    	System.out.println(Thread.currentThread().getName());
	}
}
