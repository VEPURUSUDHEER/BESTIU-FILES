package org.tns.capgemini.c2tc.exceptionhandling;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50/5;
		System.out.println(num);
		
		
		
		try {
			int num1=50/0;
			System.out.println(num1);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	

	}

}
