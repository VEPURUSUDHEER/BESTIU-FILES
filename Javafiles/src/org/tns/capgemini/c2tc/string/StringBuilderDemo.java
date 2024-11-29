package org.tns.capgemini.c2tc.string;

public class StringBuilderDemo {    //no thread safety

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Initial Value");
		
		sb.append(" sudheer"); //add appende to the end
		sb.append(" vepuru");  //add again to the end

		
		sb.insert(15, "333");
		
		sb.replace(22 ,23,"HI");
		
		sb.delete(15,18);
		
		sb.reverse();
		
		System.out.println("Final stringbuilder result" +"   " + sb.toString());

	}

}