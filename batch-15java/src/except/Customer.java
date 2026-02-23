package except;

public class Customer {
	int bill=500;
	public void payment(int amount){
		if(bill<amount) {
			System.out.println("payment success");
		}
		else {
			//System.out.println("transaction failed");
		throw new InsufficientFundException("add amount");//
		}
		
	}
	public static void main(String[] args) {
		Customer a=new Customer();
		a.payment(100);
	}

}
