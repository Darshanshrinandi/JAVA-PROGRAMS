package Basics;

public class AppRegister {
     
	String name,password,email;
	long phonenum;
	
	AppRegister(String arg1,String arg2,String arg3){
		  
		name=arg1;
		password=arg2;
		email=arg3;
		
	}
	
	AppRegister(String arg1,String arg2,String arg3,long arg4){
		name =arg1;
		password=arg2;
		email=arg3;
		phonenum=arg4;
		
	}
	
	public void display() {
		System.out.println("UserName: "+name+" passowrd: "+password+" Email: "+email+" PhoneNumber: "+phonenum);
	}
}

   class Main{
	   public static void main(String[] args) {
		
		   AppRegister app1= new AppRegister("Darshan S V", "452002", "darshanshrinandi@gmail.com");
		   
		   app1.display();
		   
		   AppRegister app2 = new AppRegister("Darshan S V", "452982", "darshanshrinandi@gmail.com", 886134054);
		   app2.display();
	}
   }
