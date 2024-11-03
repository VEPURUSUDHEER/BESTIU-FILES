//5. Write a Java program to create a 3x3 matrix and print its elements.//
package assignment;
public class matxiElements {
      public static void main(String[] args) {
    	  int a[][]=new int[3][3];
    	  for(int i=0;i<3;i++) {
    		  for(int j=0;j<3;j++) {
    			  a[i][j]=(i+1)*(j+1);    			  
    		  }   		  		 
    	  } 
    	  for(int i=0;i<3;i++) {
    		  for(int j=0;j<3;j++) {
    			System.out.print(a[i][j] + " ");   			  
    		  }
    		  System.out.println();   		 
    	  }     	    	
	}
}
