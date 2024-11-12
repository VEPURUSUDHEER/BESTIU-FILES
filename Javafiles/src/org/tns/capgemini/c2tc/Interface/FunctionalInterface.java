package org.tns.capgemini.c2tc.Interface;


class GreetingsImp implements InterfaceDemo3{
	@Override
	public void sayHello(String name) {
		System.out.println("hello"+" "+name+"!");
		
	}
}



public class FunctionalInterface {
	public static void main(String[] args) {
		InterfaceDemo3 obj=new GreetingsImp();
		obj.sayHello("sudheer");
		
		
	}

}
