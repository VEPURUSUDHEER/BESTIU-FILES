package oops;

public class Object_KiaMotors {
	int nocar;
	String model;
	String engine;
	int speed;
	void display() {
		System.out.println("this is kia ");
	}
	void welcome() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_KiaMotors obj=new Object_KiaMotors();
		obj.display();
		obj.welcome();
		obj.nocar=5;
		obj.model="KIA";
		obj.engine="Smartstream";
		obj.speed=90;
		System.out.println(obj.nocar);
		System.out.println(obj.model);
		System.out.println(obj.engine);
		System.out.println(obj.speed);
		

	}

}
