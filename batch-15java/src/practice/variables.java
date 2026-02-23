package practice;

public class variables {
	int i=12;//instance variable
	static int q=123;//static variable
	
	public void m1() {
		int i=123;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void m2() { 
		System.out.println("yaseen");
	}
	public static void main(String[] args) {
		
		variables a1=new variables();
		a1.m1();
		variables.m2();
		System.out.println(variables.q);
		
	}

}
