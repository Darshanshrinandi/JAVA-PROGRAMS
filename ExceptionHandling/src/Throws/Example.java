package Throws;

//USE OF THROWS KEYWORD FOR UNCHECKED EXCEPTION
public class Example {
	
	public static void divide(int n) throws ArithmeticException {
		
		System.out.println(n/0);
	}
	
     public static void main(String[] args) {
		
    	 try {
    		 divide(10);
    		 
    	 }
    	 catch(ArithmeticException e) {
    		 System.out.println("Invalid Denominator");
    	 }
	}
}
