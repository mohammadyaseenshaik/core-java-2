package Loops;

public class ForTest {
	public void test() {
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
	}
	public void test2() {
		for(int i=10; i>=1; i--) {
			System.out.println(i);	
		}
	}
public static void main(String[] args) {
		ForTest s=new ForTest();
		s.test();
		s.test2();
	}

}
