package oops;
class Human2{
	private int age;                       			//using private keyword in encapsulation
	private String name;    						//using private keyword in encapsulation
	private int id;  								//using private keyword in encapsulation
	public int getAge() {  					//using getter and setter methods in this program
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

public class After_EncapsulationSetterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 obj=new Human2();
		obj.setAge(21);
		obj.setName("sudheer");
		obj.setId(2102052);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		
		

	}

}
