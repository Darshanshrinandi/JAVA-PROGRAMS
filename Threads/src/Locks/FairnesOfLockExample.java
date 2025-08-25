package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnesOfLockExample {
	                          // IMPLIMENTATION CLASS FOR LOCK INTERFACE
	private final Lock lock = new ReentrantLock(true);

	public void accessResource() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + " Acquired the lock");
			Thread.sleep(1000);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock();
			System.out.println(Thread.currentThread().getName() + " released The lock");
		}
	}

}
