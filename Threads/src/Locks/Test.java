package Locks;

public class Test {
	
	  public static void main(String[] args) {
		
		  FairnesOfLockExample f= new FairnesOfLockExample();
		  
		   Runnable r= new Runnable() {
			    
			   public void run() {
				   f.accessResource();
			   }
		   };
		   
		   Thread t1=new Thread(r,"Thread 1");
		   Thread t2 = new Thread(r,"Thread 2");
		   Thread t3 = new Thread(r,"Thread 3");
	
		   try {
			   t1.start();
			   Thread.sleep(50);
			   
			   t2.start();
			   Thread.sleep(50);
			   
			   t3.start();
			   Thread.sleep(50);
		   }catch(Exception e) {
			   
		   }
	}

}
