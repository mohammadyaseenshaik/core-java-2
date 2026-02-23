package oops;

public class abhibus implements phonepay{
	@Override
	public void ticketbooking() {
		String from="sattenapalli";
		String to="guntur";
		String name="yaseen";
		String busname="flexbus";
		int ticketprice=1299;
		System.out.println("from::"+from);
		System.out.println("to::"+to);
		System.out.println("name::"+name);
		System.out.println("bus name::"+busname);
		System.out.println("ticket price::"+ticketprice);
		
	}
	
	public static void main(String[] args) {
		abhibus a=new abhibus();
		a.ticketbooking();
		
	}
	
	

}
