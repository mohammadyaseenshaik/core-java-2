package oops;

public class Savingaccount extends Accounts implements Atmservice, onlineservice {
	public void accounttype() {
		System.out.println("saving account");
	}
  @Override
	public void fundtransfer() {
	System.out.println("funds transfer from account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw amount from atm");
		

}
	public static void main(String[] args) {
		Savingaccount a=new Savingaccount();
		a.accounttype();
		a.fundtransfer();
		a.withdraw();
		a.dispute();
		
	}
}   