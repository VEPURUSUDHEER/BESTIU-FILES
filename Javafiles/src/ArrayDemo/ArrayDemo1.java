package ArrayDemo;

public class ArrayDemo1 {
public static void main(String[] args) {
	//1)static initialization
	int a[]= {1,2,3,4};   //static initialization
	System.out.println(a[2]);
	a[3]=5;
	System.out.println(a[3]);
	
	
	
	//2)Dynamic initialization
	int b[]=new int[4];
	b[0]=5;
	b[1]=6;
	b[2]=7;
	b[3]=8;
	System.out.println(b[0]+" ,"+b[1]+" ,"+b[2]+" ,"+b[3]);
	
	
	//using for loop
	int c[]=new int[4];
	c[0]=5;
	c[1]=6;
	c[2]=7;
	c[3]=8;
	for(int i=0;i<=3;i++) {
		System.out.print(c[i]+",");
	}
}
}