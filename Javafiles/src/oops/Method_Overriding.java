package oops;

 class Animal{
	public void sound() {
		System.out.println("animal is sounding");
	}
}
class Bird extends Animal{
	public void sound() {
		System.out.println("bird is flying");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("cat is meouing");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird a=new Bird();
		a.sound();
		Cat b=new Cat();
		b.sound();
		Animal c=new Animal();
		c.sound();
		

	}

}

