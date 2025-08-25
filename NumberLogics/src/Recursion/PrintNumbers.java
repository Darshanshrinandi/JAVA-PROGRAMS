package Recursion;

public class PrintNumbers {
    
	
	public static void printNum(int n) {
		if(n==0)
			return;
		printNum(n-1);
	}
	public static void main(String[] args) {
		   printNum(5);
	}
	
}
