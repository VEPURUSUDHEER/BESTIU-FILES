//8. Write a Java program to create a class Car with a default constructor that
//initializes the car’s model and price.
//Hint: Define a class with a constructor and instance variables
package assignment;
class car{
	String model;    
	 long price; 
	 public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}	     
//default constructor
public car(){
	this.model="Kia";
	this.price=1000000;	
}
}
public class defaultConstructor {
	public static void main(String[] args) {
		car obj=new car();
		System.out.println("car model is:"+obj.model+   "\ncar price is:"+obj.price);		
	}
}
