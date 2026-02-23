 package practice;

public class B extends A {
	//child class
	int i=23;
	public void gold() {
		System.out.println("gold is belongs to B");
	}
	public void bike() {
		System.out.println("car is belongs B");
	}
	public static void main(String[] args) {
		B a1=new B();//child-subclass
		a1.bike();
		a1.gold();
		System.out.println(a1.age);
		System.out.println(a1.i);
		System.out.println("---------------");
		
		A b1=new A();//parent class
		System.out.println(b1.age);
		b1.car();
		b1.gold();
		System.out.println("----------------");
		//b1.car(); parent obj can't access child
		A a2=new B();
		a2.car();
		a2.gold();
		
		
		
	}

}
