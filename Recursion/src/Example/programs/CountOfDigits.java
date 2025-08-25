package Example.programs;

public class CountOfDigits {
	public static void main(String[] args) {
		
		System.out.println(countNums(123456));
		
	}
	public static int countNums(int n) {
		
	if(n==0) {
		return 0;
		
	}
	return 1 + countNums(n/10);
		
		
	}

}
