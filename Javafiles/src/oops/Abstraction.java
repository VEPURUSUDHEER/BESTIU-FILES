package oops;

abstract class AbstractAnimal{
	//abstract method(does not have a body)
	public abstract void animalSound();
	//regular method
	public void sleep() {
		System.out.println("zzzzz");
	}
}
//subclass (inherit from AbstractAnimal)
class Cow extends AbstractAnimal{
	public void animalSound() {
		System.out.println("cow says:moo");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow myCow=new Cow();
		myCow.animalSound();
		myCow.sleep();
		
	}

}
