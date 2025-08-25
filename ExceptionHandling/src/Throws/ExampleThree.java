package Throws;
import java.io.*;

//USE OF THROWS KEYWORD FOR UNCHECKED EXCEPTION
public class ExampleThree {
	
	   public static void readData() throws FileNotFoundException {
		   
		   FileReader f= new FileReader("Student.txt");
	   }
	   
	   public static void main(String[] args) {
		
		   try {
			   readData();
		   }catch(FileNotFoundException f) {
			   System.out.println(f.getMessage());
		   }
	}
	

}
