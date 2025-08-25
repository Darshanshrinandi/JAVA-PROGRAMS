package GarbageCollection;

import java.lang.ref.WeakReference;

public class Gc   {
	
	public static void main(String[] args) {
		
		WeakReference<Student> student = new WeakReference<Student>(new Student("Darshan","A"));
		System.out.println(student.get());
		
		System.gc();
		
		try {
			Thread.sleep(4000);
			System.out.println(student.get());
		}
		catch(Exception ignored) {
			
		}
	}
}

class Student{
	
	String name;
	String grade;
	
	Student(String name,String grade){
		this.name=name;
		this.grade= grade;
	}

	@Override
	public String toString() {
	    return "Name: "+name+"Grade: "+grade;
	}
	

	

}
