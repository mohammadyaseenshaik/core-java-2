package Practice2;

public class MethodsPractice {
//	public void emp() {
//		int id=1234;
//		String name="yaseen";
//		System.out.println(id+name);	
//	}
	public void emp(int id) {
		System.out.println(id);
		
	}
	public int emp1() {
		 int num=1234;
		return num;
	}
	public int emp3(int id,int rnum) {
		int num=12;
		System.out.println(id+" "+rnum);
		return num;
		
	}
public static void main(String[] args) {
	MethodsPractice a=new MethodsPractice();
	System.out.println(a.emp3(991,56));
//	a.emp1();
//	a.emp();
}
}
