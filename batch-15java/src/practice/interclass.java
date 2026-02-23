package practice;

public class interclass implements interface2 {
	public void details() {
		int id=991;
		String name="yaseen";
		System.out.println("Id::"+id);
		System.out.println("Name::"+name);
	}
	public void m1() {
		String fname="Mohammad";
		String fullname=fname.concat("  Yaseen");
		System.out.println(fullname);
	}
	public static void main(String[] args) {
		interclass a=new interclass();
		a.details();
		a.m1();
	}

}
