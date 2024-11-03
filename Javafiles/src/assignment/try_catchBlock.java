/*10. Write a Java program to demonstrate a try-catch block by catching an
ArithmeticException when dividing by zero.
Hint: Use try and catch to handle the exception.*/
package assignment;
public class try_catchBlock {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
       catch(ArithmeticException e) {
	                 System.out.println(e);
           }
	}
}
