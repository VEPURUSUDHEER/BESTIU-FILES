package org.tns.capgemini.c2tc.oops;

class Bike{
	void sound() {
		System.out.println("bike sound");          //single inheritance
														//one single class extends one single class
	}
}
class Car extends Bike{             
	void racing() {
		System.out.println("car sound");
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.sound();
		obj.racing();
		
		

	}

}
