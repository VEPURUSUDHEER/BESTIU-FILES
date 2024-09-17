package practice;

public class Ifelse_Ifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sudheer";
		int marks=98;
		if(marks>=90){
			System.out.println("grade Outstanding");
		}
		else if(marks>=80) {
			System.out.println("grade A+");
			
		}
		else if(marks>=70) {
			System.out.println("grade A");
		}
		else if(marks>=60) {
			System.out.println("grade B");
		}
		else if(marks>=50) {
			System.out.println("grade C");
		}
		else if(marks>=36) {
			System.out.println("pass");
		}
		else {
			System.out.println("sorry! you are failed");
		}
	}

}
