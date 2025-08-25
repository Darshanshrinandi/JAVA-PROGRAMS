package Synchronization;

public class MyThread extends Thread{
	
	Counter counter;
	
	MyThread(Counter counter){
		
		this.counter=counter;
	}
	
	@Override
	public void run() {
		 for(int i =1;i<1000;i++) {
			 
			 counter.increment();
		 }
	}
	
}


