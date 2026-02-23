package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts>{
	int id;
	String name;
	double price;
	public TataProducts(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(TataProducts o) {
		
		//return this.id-o.id;
		//return this.name.compareTo(o.name);
				
		return (int) (this.price-o.price);
	}
	
	@Override
	public String toString() {
		return "TataProducts [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		TataProducts t1=new TataProducts(101, "Tcs", 23.4);
		TataProducts t2=new TataProducts(109, "Tata water", 25.4);
		TataProducts t3=new TataProducts(105, "Titan", 278.4);
		TataProducts t4=new TataProducts(103, "Tata Salt", 12.4);
		List<TataProducts> list=new ArrayList<TataProducts>();
		                   list.add(t1);
		                   list.add(t2);
		                   list.add(t3);
		                   list.add(t4);
		                   Collections.sort(list);
		                   for(TataProducts i:list) {
		                	   System.out.println(i.id+"::"+i.name+"::"+i.price);
		                	   
		                   }
		                   
		                   
		
	}
	

}
