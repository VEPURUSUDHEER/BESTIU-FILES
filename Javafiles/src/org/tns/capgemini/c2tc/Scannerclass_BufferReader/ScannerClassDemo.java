package org.tns.capgemini.c2tc.Scannerclass_BufferReader;
import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		System.out.println("enter your age:");
		
		String name=sc.nextLine();
		int age=sc.nextInt();
		
		
		System.out.println("your name is:"+name);
		System.out.println("your age is:" +age);

	}

}
