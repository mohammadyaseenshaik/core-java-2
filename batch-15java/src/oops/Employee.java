package oops;

public class Employee {
	public Employee() {
		System.out.println("constructor");
	}
	public Employee(int id) {
		System.out.println("int arg constructor::"+id);
	}
	public Employee(int id,String name) {
		System.out.println("multiple args constructor::"+id+"\t"+name);
		
	}
public static void main(String[] args) {
	Employee a=new Employee();
	Employee b=new Employee(24);
	Employee c=new Employee(24,"yaseen");
}
}
