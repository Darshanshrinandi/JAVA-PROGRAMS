package Locks;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private int balance=100;
	
	private final Lock lock = new ReentrantLock();
	 
	public void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" Attempting to Withdrwan");
		
	  try {
		if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
			  
			 if(balance>=amount) {
				 try {
				 System.out.println(Thread.currentThread().getName()+" Processing Withdrwan:");
				 Thread.sleep(2000);//TIME TAKEN TO PROCESS THE WITHDRWAN
				 balance-=amount;
				 System.out.println(Thread.currentThread().getName()+" Balanace is: "+balance);
				 }
				 catch(Exception e) {
					 Thread.currentThread().interrupt();
				 }
				 finally {
					 lock.unlock();
				 }
			 }
			 
			 else {
				 System.out.println(Thread.currentThread().getName()+" Insufficient Balance");
			 }
			 
		  }
		else {
			System.out.println(Thread.currentThread().getName()+" Could not aquire the Lock will try Later");
		}
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
		
	}
		
	}
	
	
}
