package modifier1;
import modifier2.classC;
import modifier2.classD;


public class classA {
	public int yaseen;
	public void am1() {
		System.out.println("A  class m1 method ");
	}
	public static void main(String[] args) {
		classA a=new classA();
		System.out.println(a.yaseen);
		a.am1();
		
		classB b=new classB();
		System.out.println(b.bid);
		b.bm1();
		
		classC c=new classC();
		System.out.println(c.animal);
		c.cm1();
		
		classD d=new classD();
		System.out.println(d.human);
		d.dm1();	
	}
}
