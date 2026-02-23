package oops;

public class Employee4 {
	int id;
	String name;
	long salary;
	public Employee4() {
		System.out.println("zero arg constructor");
	}
	public Employee4(int id,String name,long salary) {
		this.id=id;
		name=name;
		salary=salary;
	}
	public static void main(String[] args) {
		Employee4 a=new Employee4();
		System.out.println(a.id+"\t"+a.name+"\t"+a.salary);
		Employee4 a1=new Employee4(24,"yaseen",1200000);
		System.out.println(a1.id+"\t"+a1.name+"\t"+a1.salary);
	}

}
