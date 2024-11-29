//q1)write a java program that uses a switch statement to print name 
//of day based on number input(1 for monday ,2 for tuesday,etc)

package org.tns.capgemini.c2tc.assignment;
import java.util.Scanner;

public class switchStatement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for a day in a week:");
		int dayNumbers =sc.nextInt();
		switch(dayNumbers) {
		case 1:
			System.out.println("day 1 is monaday");
			break;
		case 2:
		    System.out.println("day 2 is tuesday");
		    break;
		case 3:
			System.out.println("day 3 is wednesday");
			break;
		case 4:
			System.out.println("day 4 is thursday");
			break;
		case 5:
			System.out.println("day 5 is friday");
			break;
		case 6:
			System.out.println("day 6 is saturday");
			break;
		case 7:
			System.out.println("day 7 is sunday");
			break;
			
		
		}
		
		

	}

}
