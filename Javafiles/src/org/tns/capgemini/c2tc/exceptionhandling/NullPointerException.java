package org.tns.capgemini.c2tc.exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=null;
	
		
		try {
			int b=a.length();
			int c=a.indexOf(2);
			System.out.println(b);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("null pointer exception");
		}
		
		

	}

}
