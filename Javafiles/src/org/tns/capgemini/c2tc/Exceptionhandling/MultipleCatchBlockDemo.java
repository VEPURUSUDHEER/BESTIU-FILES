package org.tns.capgemini.c2tc.Exceptionhandling;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			int a=50/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

}
