package Locks;

public class Main {
	public static void main(String[] args) {
		BankAccount sbi = new BankAccount();
		Runnable run = new Runnable() {

			@Override
			public void run() {
			 sbi.withdraw(50);
				
			}
		};
		
		Thread t1 = new Thread(run,"Thread One");
		Thread t2 = new Thread(run,"Thread Two");
		
		t1.start();
		t2.start();
		

}
}