package oops;

public interface phonepay {
	//interface allows only abstract method
	int id=10;//we can initialize variable in interface
	
	{
		//we can't create instance block in interface
	}
	static{
		// we can't create static block in interface
	}
	public phonepay() {
		//we can't create constructor in interface
	}
	public abstract void ticketbooking(); //interface allows only abstract method
	public static void main(String[] args) { //we can't create object in interface
		phonepay a=new pay();
		a.ticketbooking();
	}
	
	

}
