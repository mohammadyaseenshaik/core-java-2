package oops;

public class Customer {
	int id;
	String name;
	int age;
	public Customer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Customer() {
		
	}
	public static void main(String[] args) {
		Customer a=new Customer(123, "yaseen", 21);
		System.out.println(a.id+"\t"+a.name+"\t"+a.age);
	}
}
