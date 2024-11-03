//3. Write a Java program to find the sum of all even numbers between 1 and 100
//using a while loop.

package assignment;

public class whileLoop {

	public static void main(String[] args) {
	
		System.out.println("sum of all even numbers between 1 and 100 are:");
		int i=1;
		int sum=0;
		while(i<=100) {
			if(i%2==0) {
				sum=sum+i;
				System.out.println(sum);
		    }
		   i++;
		 }
	}
}
