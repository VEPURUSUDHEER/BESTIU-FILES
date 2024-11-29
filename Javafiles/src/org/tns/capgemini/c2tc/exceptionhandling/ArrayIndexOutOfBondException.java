package org.tns.capgemini.c2tc.exceptionhandling;

public class ArrayIndexOutOfBondException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]=new int[4];
         
        try {
        	int b=a[6];
        	System.out.println(b);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        finally {
        	System.out.println("arrayindexoutofbondexception");
        }
         
	}

}
