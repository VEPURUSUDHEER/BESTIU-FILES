package oops;
class  A{
	void abc() {
		System.out.println("hi ");
	}
}
class B extends A{
	void def() {
		System.out.println("welcome");
	}
}
class C extends A{
	void ghi() {
		System.out.println("to university");
	}
}
class D extends A{
	void jkl() {
		System.out.println("we are glad to meet you");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		C obj1=new C();
		D obj2=new D();
		obj.abc();
		obj.def();
		obj1.ghi();
		obj2.jkl();
			
	}

}
