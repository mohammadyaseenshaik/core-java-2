package Streams;

public class Reference {
	public static boolean even(int val) {
		return val%2==0;
	}
	
	public static int add(int val) {
		return val+2;
	}
	
	public    boolean odd(int val) {
		return val%2!=0;
	}
	
	public int multiply(int val) {
		return val*2;
	}
	public static void main(String[] args) {
		Reference a=new Reference();
		System.out.println(a.even(2)+"\n"+a.odd(3)+"\n"+a.multiply(2)+"\n"+a.add(5));
		
	}

}
