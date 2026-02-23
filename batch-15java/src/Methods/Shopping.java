package Methods;

public class Shopping {
	int total;
	int billwithtax;
	int billwithgst;
	public int cloths() {
		int shirt=799;
		int pant=1000;
		total=shirt+pant;
		billwithtax=tax(total);
		billwithgst=gst(billwithtax);
		return billwithgst;
		
	}
	public int mobile() {
		int realme=20000;
		int redmi=30000;
		total=realme+redmi;
		billwithtax=tax(total);
		billwithgst=tax(billwithtax);
		return billwithgst;
	}
public int electronic() {
	int washingmachine=15000;
	int laptop= 50000;
	total=washingmachine+laptop;
	billwithtax=tax(total);
	billwithgst=tax(billwithtax);
	return billwithgst;
}
public int gst(int st) {
	int withgst=st+100;
	return withgst;
}
public int tax(int bill) {
	int withtax=bill+100;
	return withtax;
}

public void totalBil1() {
	int mobileBil=mobile();
	System.out.println("mobilebill:"+" "+mobileBil);
	int electronicBil=electronic();
	System.out.println("electronicbill:"+electronicBil);
	int clothsbill=cloths();
	System.out.println(" clothsbill:"+ clothsbill);
	
	int finalbil=mobileBil+electronicBil+clothsbill;
	System.out.println("TotalBill:"+finalbil);
	
}
public static void main(String[] args) {
	Shopping m1=new Shopping();
	m1.totalBil1();
	
	
}
	

}
