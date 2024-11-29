//4. Write a Java program to store and print 5 integers in an array.//
package org.tns.capgemini.c2tc.assignment;
public class storingArray5Integers {
    public static void main(String[] args) {
    	int arr[]=new int[5];
    	arr[0]=1;
    	arr[1]=2;
    	arr[2]=3;
    	arr[3]=4;
    	arr[4]=5;
    	System.out.println("array stored integers are:");
    	for(int i=0;i<=4;i++) {
    		System.out.println(arr[i]);
    	}
    	
	}

}
