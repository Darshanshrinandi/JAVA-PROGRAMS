package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
	
	 private BlockingQueue<Integer> bq;
	 private int value =0;
	 
	 public Producer(BlockingQueue<Integer> bq) {
		  this.bq=bq;
	 }
	 
	@Override
	public void run() {
		
		  while(true) {
		     try {
                   System.out.println("Producer Produced: "+value);
                   bq.put(value++);
                   Thread.sleep(1000);
		     }
		     catch(Exception e) {
		    	 Thread.currentThread().interrupt();
		    	 System.out.println("Producer Interrupted");
		     }
		  }
	}
}

 class Consumer implements Runnable{
	 
	 private BlockingQueue<Integer> bq;
	 
	 public Consumer(BlockingQueue<Integer> bq) {
		 this.bq = bq;
	 }

	@Override
	public void run() {
		
		try {
			while(true) {
				Integer value=bq.take();
				System.out.println("Consumer consumed: "+value);
				bq.put(value);
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			Thread.currentThread().interrupt();
		     
			System.out.println("Consumer Interupted");
			
		}
	}

 }




public class BlockingQueueDemo {
	public static void main(String[] args) {
		
	     BlockingQueue bq = new ArrayBlockingQueue(5);
	     
	     Thread one = new Thread(new Producer(bq));
	     Thread two = new Thread(new Consumer(bq));
	     
	     one.start();
	     two.start();
	     
	}

}
