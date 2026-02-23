package variables;

public class Product {
	String name="Iphone";
	static double amt=57500.99;
	public static void main(String[] args) {
		int prodId=123;
		System.out.println(prodId);
		Product p=new Product();
		System.out.println(p.name);
		System.out.println(p.amt);
	}

}
