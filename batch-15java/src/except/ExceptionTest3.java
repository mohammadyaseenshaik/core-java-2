package except;

public class ExceptionTest3 {
	public int m1() {
	try {
	int i=100;
	int j=0;
	int k=i/j;
	System.out.println(k);
	return 10;
	}catch(Exception e) {
		e.printStackTrace();
		return 20;
	}finally {
		return 30;// finally always excute either exception occurs or nor 
	}
}
	public static void main(String[] args) {
		ExceptionTest3 a=new ExceptionTest3();
		System.out.println("return value::"+a.m1());
	}

}
