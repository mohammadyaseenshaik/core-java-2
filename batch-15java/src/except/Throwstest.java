package except;

public class Throwstest {
	public void m1() throws InterruptedException{
		System.out.println("throw..");
		for(int i=0;i<6;i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
	}
	
	public void m2 () throws InterruptedException {
		System.out.println("m2 method");
		m1();
	}
	public void m3() throws InterruptedException {
		System.out.println("m3 method");
		m2();
	}
	public static void main(String[] args) throws InterruptedException {
		Throwstest a=new Throwstest();
		a.m2();
	}

}
