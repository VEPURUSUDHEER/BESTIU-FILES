package org.tns.capgemini.c2tc.practice;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="monday";
		switch(day){
		case "monday":
			System.out.println("work on project on monday");
			break;
		case "Tuesday":
			System.out.println("work on project on tuesday");
			break;
		case "wednesday":
			System.out.println("work on project on wednesday");
			break;
		case "thursday":
			System.out.println("work on project on thursday");
			break;
		case "friday":
			System.out.println("work on project on friday");
			break;
		case "saturday":
			System.out.println("work on project on saturday");
			break;
		case "sunday":
			System.out.println("work on project on sunday");
		    break;
		default :
			System.out.println("you entered invalid day");
		}
	}

}
