package practice;
class a
{
	void eat() 
	{
		System.out.println("hi ravi");
	}
	
	
}
class b extends a
{
	void bark()
	{
		System.out.println("hi sudheer");
	}
}
class c extends b
{
	void sound()
	{
		System.out.println("hi vasu");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.sound();
		obj.bark();
        obj.eat();
	}

}
