package assignment;

//Add new feature without changing old cod

interface PaymentMethod{
	void pay();
}

class credit implements PaymentMethod{
	public void pay() {
		System.out.println("process CreditCard Payment");
	}
}
//this is new feature
class debit implements PaymentMethod{
	public void pay() {
		System.out.println("process DebitCard Payment");
	}
}
class Processor{
	void Process(PaymentMethod paymentMethod) {
		paymentMethod.pay();
		
	}
}

public class Open_Close_P {

	public static void main(String[] args) {
		Processor p=new Processor();
		p.Process(new credit());
		p.Process(new debit());
	}

}