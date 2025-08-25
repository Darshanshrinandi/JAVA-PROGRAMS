package ThreadClass;

//THREAD IS CLASS WHICH IS PRESENT IN JAVA.LANG PACAKGE

   //STEP 1:EXTENDS THREAD CLASS
public class World extends Thread{
	   
	//OVERRIDE RUN METHOD
	  
	@Override
	public void run() {
		
		 System.out.println(Thread.currentThread().getName());
          for(int i=1;i<11;i++) {
        	  
        	  System.out.println(i);
          }
	}
	
	

}
