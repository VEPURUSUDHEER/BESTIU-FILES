package org.tns.capgemini.c2tc.exceptionhandling;

public class StringOutOfBondException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String a="sudheer";
			System.out.println(a.charAt(9));
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("StringIndexOutOfBoundsException");
		}
		

	}

}
