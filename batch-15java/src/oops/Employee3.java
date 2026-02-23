package oops;

public class Employee3 {
	int id;
	String name;
	long salary;
	public Employee3() {
		System.out.println("zero arg constructor");
	}
	public Employee3(int empid) {
		id=empid;
		System.out.println("int arg constructor ");
	}
	public Employee3(int empid,String empname ) {
		id=empid;
		name=empname;
		System.out.println("int and string srgs constructor");
	}
	public Employee3(int empid,String empname,long empsalary) {
		id=empid;
		name=empname;
		salary=empsalary;
		System.out.println("int ,String and long args constructor");
	}
public static void main(String[] args) {
	Employee3 a=new Employee3();
	System.out.println(a.id+"\t"+a.name+"\t"+a.salary);
	
	Employee3 a1=new Employee3(20);
	System.out.println(a1.id+"\t "+a1.name+"\t"+a1.salary);
	
	Employee3 a2=new Employee3(20,"raju");
	System.out.println(a2.id+"\t"+a2 .name+"\t"+a2.salary);
	
	Employee3 a3=new Employee3(20,"yaseen",20000);
	System.out.println(a3.id+"\t"+a3.name+"\t"+a3.salary);
	
	
	
	
}

}
