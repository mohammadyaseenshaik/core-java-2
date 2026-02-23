package Methods;

public class Shopping1 {
	public int mobile() {
		int realme=15000;
		int redmi=25000;
		int total=realme+redmi;
		int gstbill=gst("mobile",total);
		int totalwithgst=total+gstbill;
		return totalwithgst;
	}
	public int electronic() {
		int washingmachine=15000;
		int laptop= 50000;
		int total=washingmachine+laptop;
		int gstbill=gst("electronic",total);
		int totalwithgst=total+gstbill;
		return totalwithgst;
	}
	public int gst(String catg, int bill) {
		int gstamt;
		if(catg.equals("mobile")) {
		 gstamt=(bill*10)/100;	
		}else {
			gstamt=(bill*20)/100;
		}
		return gstamt;
	}
	
	
	public void totalbill() {
		int mobilebill=mobile();
		System.out.println("mobilebill:"+mobilebill);
		int electronicbill=electronic();
		System.out.println("electronicbill:"+electronicbill);
	}
public static void main(String[] args) {
	Shopping1 s=new Shopping1();
	s.totalbill();
}
}
