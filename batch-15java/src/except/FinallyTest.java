package except;

public class FinallyTest {
	public void m1() {
		try {
		int i=100;
		int j=0;
		int k=i/j;
		System.out.println(k);
		System.out.println("try block..");
	}catch(ArithmeticException e) {
		System.out.println("catch block..");
		e.printStackTrace();
	}finally {
		System.out.println("final block..");
	}
		
}
	public static void main(String[] args) {
		FinallyTest a=new FinallyTest();
		a.m1();
	}


}
