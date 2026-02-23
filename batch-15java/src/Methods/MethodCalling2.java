package Methods;

public class MethodCalling2 {
	int total;
	int gst;
	int totaltaxs;
	public int mobile() {
		int realme=12000;
		int redmi=13000;
		total=realme+redmi;
		System.out.println("Total amount of mobiles:"+total);
		int gst=gst("mobile",total);
		System.out.println("Gst amount on mobile:"+gst);
		int cgst=cgst("mobile",total);
		System.out.println("cgst amount on mobile:"+cgst);
		int sgst=sgst("mobile",total);
		System.out.println("sgst amount on mobile:"+sgst);
		totaltaxs=total+gst+cgst+sgst;
		System.out.println("Total with gst=sgst+cgst:"+totaltaxs);
		return totaltaxs;
		
	}
	public int cloths() {
		int shirt=799;
		int pant=1000;
		total=shirt+pant;
		System.out.println("Total amount of clothes:"+total);
		gst=gst("cloths",total);
		System.out.println("Gst amount on cloths:"+gst);
		int cgst=cgst("cloths",total);
		System.out.println("cgst amount on cloths:"+cgst);
		int sgst=sgst("mobile",total);
		System.out.println("sgst amount on mobile:"+sgst);
		totaltaxs=total+gst+cgst+sgst;
		System.out.println("Total with gst=sgst+cgst:"+totaltaxs);
		return totaltaxs;
	}
	public int electronic() {
		int washingmachine=15000;
		int laptop= 50000;
		total=washingmachine+laptop;
		System.out.println("Total amount of electronics:"+total);
		gst=gst("electronic",total);
		System.out.println("Gst amount on electronics:"+gst);
		int cgst=cgst("electronics",total);
		System.out.println("cgst amount on cloths:"+cgst);
		int sgst=sgst("mobile",total);
		System.out.println("sgst amount on mobile:"+sgst);
		totaltaxs=total+gst+cgst+sgst;
		System.out.println("Total with gst=sgst+cgst:"+totaltaxs);
		return totaltaxs;
		
	}
	
	public int gst(String catg,int bill) {
		int gstAmount;
		int cgstamt;
		int sgstamt;
		if(catg.equals("mobile")) {
			cgstamt=cgst("mobile",bill);
			sgstamt=sgst("mobile",bill);
		gstAmount=sgstamt+cgstamt;
			
		}else if(catg.equals("cloths")) {
			cgstamt=cgst("mobile",bill);
			sgstamt=sgst("mobile",bill);
			gstAmount=sgstamt+cgstamt;
			
		}
		else if(catg.equals("electronics")) {
			cgstamt=cgst("mobile",bill);
			sgstamt=sgst("mobile",bill);
			gstAmount=sgstamt+cgstamt;
			
		}
		else {
			cgstamt=cgst("mobile",bill);
			sgstamt=sgst("mobile",bill);
			gstAmount=sgstamt+cgstamt;
			
		}
		return gstAmount;
		
		
	}
	 
	public int sgst(String catg, int bill) {
		int sgstAmount;
		if(catg.equals("mobile")) {
			
			 sgstAmount=(bill*10)/100;
			
		}else if(catg.equals("cloths")) {
			 sgstAmount=(bill*20)/100;
			
		}
		else if(catg.equals("electronics")) {
			 sgstAmount=(bill*30)/100;
			
		}
		else {
			sgstAmount=(bill*5)/100;
			
		}
		return sgstAmount;
		
	}
	public int cgst(String catg, int bill) {
		int cgstAmount;
		if(catg.equals("mobile")) {
			
			 cgstAmount=(bill*10)/100;
			
		}else if(catg.equals("cloths")) {
			 cgstAmount=(bill*20)/100;
			
		}
		else if(catg.equals("electronics")) {
			 cgstAmount=(bill*30)/100;
			
		}
		else {
			cgstAmount=(bill*5)/100;
			return cgstAmount;
		}
		
		return cgstAmount;
	}

	public void totalBill() {
		int mobileBill=mobile();
		System.out.println("\n");
		int clothsBill=cloths();
		System.out.println("\n");
		int electronicBill=electronic();
		System.out.println("\n");
		int finalBill= mobileBill+clothsBill+electronicBill;
		System.out.println("finalbill:"+finalBill);
	
	}
	public static void main(String[] args) {
		MethodCalling2 s=new MethodCalling2();
		s.totalBill();

		
	}

}
