package modifier1;

public class classB {
	public int bid;
	public void bm1() {
		System.out.println("B class m1 method ");
	}
	public static void main(String[] args) {
		classB b=new classB();
		System.out.println(b.bid);
		b.bm1();
	}

}
