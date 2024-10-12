package oops;

class TicketBooking{
	private String customerName;
	private String showName;
	private int noOfTickets;
	private double ticketPrice;
	private double totalAmount;
	public TicketBooking(String customerName,String showName,int noOfTickets,double totalAmount,double ticketPrice) {
		this.customerName=customerName;
		this.showName=showName;
		this.noOfTickets=noOfTickets;
		this.ticketPrice=ticketPrice;
		this.totalAmount=totalAmount;
		
	}
	
}
public void makePayment(double amount) {
	System.out.println("payment successfull.Receipt will be printed");
	printReceipt();
}
public void makePayment(String walletName,String walletId) {
	
}





public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
