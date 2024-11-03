//6. Write a Java program to create a method that takes two numbers as input and
//returns their product.
//Hint: Define a method with parameters and a return type
package assignment;
class multiply{
	public static int multiplication(int a,int b) {
		return a*b;		
	}
}
public class returnMethod {
	public static void main(String[] args) {
	System.out.print("product of two numbers:");
	multiply obj=new multiply();	
	System.out.println(obj.multiplication(5,6));
	}
}
