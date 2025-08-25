package ArrayLogics;
import java.util.Scanner;

//TAKEING USER INPUT FOR ARRAY
public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size= sc.nextInt();
		String []names=new String[size];
		
		System.out.println("Enter the Array Elements");
		
		for(int i =0;i<=names.length;i++) {
			 
			   names[i]=sc.nextLine();
			   
	}

}
}
