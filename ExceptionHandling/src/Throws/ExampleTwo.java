package Throws;

//USE OF THROW KEY WORD FOR CHECKED EXCEPTION
public class ExampleTwo {
	
	public static void printNumbers(int n) throws InterruptedException {
		  
		for(int i =1;i<=n;i++) {
			
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		
		  try {
			  printNumbers(10);
			  
		  }catch(InterruptedException e) {
			  System.out.println(e.getMessage());
		  }
	}

}
