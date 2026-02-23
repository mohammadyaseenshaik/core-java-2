package collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pedilite {
	Integer pid;
	String pname;
	Double price;
	
	
	public Pedilite(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pedilite [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		Pedilite p1=new Pedilite(108,"fevicol",15.5);
		Pedilite p2=new Pedilite(105,"fevikwik",14.5);
		Pedilite p3=new Pedilite(104,"m-seal",17.5);
		Pedilite p4=new Pedilite(109,"anabond",13.5);
		List<Pedilite> list=Arrays.asList(p1,p2,p3,p4);
		
		//Collections.sort(list, new Basedonid());
		//Collections.sort(list, new Basedonname());
		//Collections.sort(list, new Basedonprice());
		
		
		String property="pid";
		String ordertype="DESC";
		
		if(property.equals("pid")){
			Collections.sort(list, new Basedonid());
		}else if(property.equals("pname")) {
			Collections.sort(list, new Basedonname());
		}else if(property.equals("price")) {
			Collections.sort(list, new Basedonprice());	
		}
		
		if(ordertype.equals("DESC")) {
			Collections.reverse(list);
		}
		
		
		for(Pedilite i:list) {
			System.out.println(i);
		}
	}
	

}
