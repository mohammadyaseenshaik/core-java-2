package oops;

public abstract class NSE {
	//hide the un-necessary data and show the necessary 
	//we can create both nrml method and abstract method
	public void stockinfo() {
		System.out.println("Infosys,tcs,hindalco,zomata,bajaj,mrf,jio,nestle");
	}
	public void IPO() {
		System.out.println("filkart,amazon,blinkit");
	}
	public void holidys() {
		System.out.println("Aug15,Jan26,Dec25");
	}
	public abstract void brockeragecharges();
	
	{
		System.out.println("NSE instance block");
	}
	static {
		System.out.println("NSE static block ");
	}
	public  NSE(){
		System.out.println("NSE constructor");
	}
	public static void main(String[] args) {
		//NSE a=new NSE();    we can't create obj in abstract class
	}

}
