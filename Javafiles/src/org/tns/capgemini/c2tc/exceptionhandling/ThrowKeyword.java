package org.tns.capgemini.c2tc.exceptionhandling;

class ThrowDemo{
	 void validate (int age) {
		try {
			  if(age<18) 
			  {
			
				  throw new Exception("you are not eligible for vote");
			  }
			  else {
				  throw new Exception("you are eligible");
		   	 }	
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
	 
}


public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThrowDemo obj=new ThrowDemo();
		obj.validate(19);

	}

}
