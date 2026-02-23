package oops;

public class AccountHoldertest {
	public static void main(String[] args) {
		AccountHolder a=new AccountHolder();
		             a.setHoldername("raju");//setter is nothing but a initialization data and setter is save ,update, delete 
		             a.setHoldername("yaseen");//initialization -setter(write)\
		             a.setBalance(20000);
		             a.setIfsc("SBIN23497");
		             a.setAccountnumber(1975648737);
		   System.out.println("Holdername:"+a.getHoldername());  
		   System.out.println("Balance:"+a.getBalance());//getter is read the data
		   System.out.println("IFSC code:"+a.getIfsc());
		   System.out.println("Accountnumber:"+a.getAccountnumber());
	}

}
