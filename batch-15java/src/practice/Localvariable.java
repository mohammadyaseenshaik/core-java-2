package practice;

public class Localvariable {
	int i=12;
	String s="yaseen";
	public void varible() {
		i=10;
		this.i=i;
		this.s=s;
		System.out.println(i);
		System.out.println(s);
		
	    
	}
	public static void main(String[] args) {
		int i=123;
		Localvariable a1=new Localvariable();
		a1.varible();
		System.out.println(a1.i);
		System.out.println(a1.s);
		
		
		
	}

}
