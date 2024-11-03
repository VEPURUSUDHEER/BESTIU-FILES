//7. Write a Java program to demonstrate method overloading by creating two
//methods with the same name but different parameter types.
//Hint: Use method overloading with different data types.
package assignment;
class methodOverLoadings{
	public static int addition(int a,int b) {
		return a+b;
	}
	public static String addition(String a,String b) {
		return a+b;
	}
}
public class methodOverLoading {
	public static void main(String[] args) {
		System.out.println("method overloading :");
		methodOverLoadings obj=new methodOverLoadings();
		System.out.println("addition of two integers:"  +obj.addition(5, 6));
		System.out.println("addition of two strings:"   +obj.addition("sudheer", "vepuru"));
	}
}
