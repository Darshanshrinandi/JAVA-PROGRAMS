package RunnableInterface;
//CREATING THREAD USING RUNNABLE INTERFACE

//STEP 1:IMPLEMENTS RUNNABLE INTERFACE
public class World implements Runnable{
	
	//OVERRIDE RUN()METHOD
	public void run() {
		 
		System.out.println(Thread.currentThread().getName());
		
		for(int i=1;i<11;i++) {
			
			System.out.println(i);
		}
		
	}

}
