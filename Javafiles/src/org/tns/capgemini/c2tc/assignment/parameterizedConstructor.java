/*9. Write a Java program to create a class Book with a parameterized constructor
to initialize the book’s title and author.
Hint: Use a constructor with parameters.*/
package org.tns.capgemini.c2tc.assignment;
class Book{
	String title;
	String author;
	
	Book(String title,String author){
	this.title=title;
	this.author=author;	
	}
}
public class parameterizedConstructor {
	public static void main(String[] args) {
		Book obj=new Book("Ramayana","valmiki");
	    Book obj1=new Book("mahabharatam","vedavyasa");
		System.out.println("book title is:"+obj.title+ ",book author is:"+obj.author );
		System.out.println("book title is:"+obj1.title+ ",book author is:"+obj1.author );
  }
}
