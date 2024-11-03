package oops;

class PaymentMethod
{
	void makePayment()
	{
		System.out.println("Processing payment");
	}
}

class CreditCard extends PaymentMethod
{
	void swipecard()
	{
		System.out.println("Swiping credit card");
	}
}

class Paypal extends PaymentMethod
{
	void loginToPaypal()
	{
		System.out.println("Logging into paypal");
	}
}
class Phonepe extends PaymentMethod
{
	void loginToPhonepe() {
		System.out.println("processing phonepe transaction");
	}
}

public class InstanceOfDemo2 {

	public static void main(String[] args) {
		PaymentMethod payment = new PaymentMethod();

		payment=new Phonepe();
		
		if(payment instanceof CreditCard)
		{
			CreditCard cc = (CreditCard) payment;
			cc.swipecard();
		}
		else if(payment instanceof  Paypal)
		{
			 Paypal  pp = (Paypal) payment;
			 pp.loginToPaypal();

		}
		else if(payment instanceof Phonepe)
		{
			Phonepe pe =(Phonepe) payment;
			pe.loginToPhonepe();q2
		}

	}

}