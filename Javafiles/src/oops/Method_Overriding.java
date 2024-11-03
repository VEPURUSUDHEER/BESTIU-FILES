package oops;											
//methodoverriding (like hierarchical inheritance with same methods)

 class Animal3{    										//class A
	public void sound() {
		System.out.println("animal is sounding");
	}
}
class Bird3 extends Animal3{							//class B extends A
	public void sound() {
		System.out.println("bird is flying");
	}
}
class Cat3 extends Animal3{								//class C extends A
	public void sound() {
		System.out.println("cat is meouing");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird3 a=new Bird3();
		a.sound();
		Cat3 b=new Cat3();
		b.sound();
		Animal3 c=new Animal3();
		c.sound();
		

	}

}

