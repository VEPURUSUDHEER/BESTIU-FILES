package org.tns.capgemini.c2tc.String;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="Hello1";
		String s3="world";
		String s4=new String("world");
		String s5="Hello";
		if(s3 == s4) {
			System.out.println("reference pointing to same object");
		}
		else {
			System.out.println("reference pointing to different object");
		}

	}

}
