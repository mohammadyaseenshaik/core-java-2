package oops;

public class upstox extends NSE{

	@Override
	public void brockeragecharges() {
		// TODO Auto-generated method stub
		System.out.println("upstox charge 30/-");
		
	}
	
	public static void main(String[] args) {
		upstox b=new upstox(); 
		b.brockeragecharges();
		b.stockinfo();
		b.IPO();
		b.holidys();
	}

}
