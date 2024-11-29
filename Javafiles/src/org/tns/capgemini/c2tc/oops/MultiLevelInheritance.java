package org.tns.capgemini.c2tc.oops;

class Bike1{						//class A
	void sound() {
		System.out.println("bike sound");          //multilevel inheritance
														
	}
}
class Car1 extends Bike1{             //class B extends A
	void racing() {
		System.out.println("car sound");
	}
	
}
class Lorry extends Car1{             //class C extends B
	void accelerate() {
		System.out.println("lorry accelerating");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lorry obj=new Lorry();				//obj creation
		obj.sound();
		obj.racing();
		obj.accelerate();
		
		

	}

}