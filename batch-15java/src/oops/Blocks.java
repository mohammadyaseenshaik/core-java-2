package oops;

public class Blocks {
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
	public Blocks() {
		System.out.println("Block");
	}
	public void m1() {
		System.out.println("yaseen");
	}
	public static void main(String[] args) {
		Blocks a=new Blocks();
		a.m1();
	}
	
	
}
