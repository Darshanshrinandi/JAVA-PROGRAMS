package LambdaExpressions;

public class Main {
	public static void main(String[] args) {
		
		MathOperation m =(a,b)->a+b;
	        int res =m.add(1,2);
	        System.out.println(res);
		  
			 
		
		
		
		
	

}

  interface MathOperation{
	  
	  public abstract int add(int a,int b);
	  
	  
  }
}
