package Example.programs;

public class PrintOneToN {
	public static void main(String[] args) {
		System.out.println(print(10));
	}
	
	public static String print(int n) {
		if(n==1) {
			return "1";
		}
		
		return print(n-1)+ " " +n;
	}

}
