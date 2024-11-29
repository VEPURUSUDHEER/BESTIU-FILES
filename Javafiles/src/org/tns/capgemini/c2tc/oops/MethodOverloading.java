package org.tns.capgemini.c2tc.oops;
//method overloading	

public class MethodOverloading {
	//method 1
	static int addition(int a,int b) {
		return a+b;
	}
	//method 2
	static double addition(double a,double b) {
		return a+b;
	}
	//method 3
	static String addition(String a,String b) {
		return a+b;
	}
	static double addition(double a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.addition(5, 4); //int,int
		obj.addition(1.1,2.3);//double,double
		obj.addition("sudheer","bestiu");//string,string
		System.out.println(obj.addition(5, 4));
		System.out.println(obj.addition("sudheer","bestiu"));
		System.out.println(obj.addition(1.1,2.3));
		System.out.println(obj.addition(5.5,4));//double,int
		
	}

}
