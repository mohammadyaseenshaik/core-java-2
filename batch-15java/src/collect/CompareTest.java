package collect;

public class CompareTest {
	public static void main(String[] args) {
		Integer a=10;
		Integer b=20;
		Integer c=10;
		System.out.println(a.compareTo(b));//if we compare small num to big num it will return -1
		System.out.println(b.compareTo(a));//if we compare big num to small num it will return +1
		System.out.println(c.compareTo(a));//if we compare small value variables it wii return 0
	}

}
