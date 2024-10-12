package oops;
class Human1{
	private int age=21;               //using private keyword in encapsulation
	private String name="sudheer";     //using private keyword in encapsulation
	public int getAge() {                 //this program using getter method in encapsulation
		return age;
	}
	//public void setAge(int age) {
	//	this.age = age;
	//}
	public String getName() {             //using getter method in encapsulation
		return name;
	}
	//public void setName(String name) {
	//	this.name = name;
	//}
}


public class After_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 obj=new Human1();
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
