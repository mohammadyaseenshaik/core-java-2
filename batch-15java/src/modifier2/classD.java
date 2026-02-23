package modifier2;

public class classD {
	public int human;
	public void dm1() {
		System.out.println("D class is m1 method");
	}
	public static void main(String[] args) {
		classD d=new classD();
		System.out.println(d.human);
		d.dm1();
	}

}
