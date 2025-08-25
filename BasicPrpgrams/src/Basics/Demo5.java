package Basics;

public class Demo5 {
	
	int x;
    double y;
	
	public Demo5(int a){
		
		System.out.println("Running constructor one");
		x=a;
	}
	
	public Demo5(double b){
		System.out.println("Running constructor Two");
		y=b; 
	}
}

         class Run{
	 public static void main(String[] args) {
		 
		 Demo5 d1 = new Demo5(3);
		  System.out.println(d1.x);
		
		  Demo5 d2 = new Demo5(4.5);
		  System.out.println(d2.y);
	}
}
