package operatos;

public class Increment_DecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(a++);//post increment,prints a value only
		System.out.println(a);//a will incremented and printed,a = 11
		
		
		System.out.println(++a);//pre increment,prints value is 12
		
		
		System.out.println(a--);//post decrement,prints a value is 12
		System.out.println(a);  //prints value is 11
		
		System.out.println(--a);//pre decrement,a is 10


	}

}
