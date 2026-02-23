package Methods;

public class Methods3 {
	public void n1() {
		System.out.println("zero parameters");
	}
	public void n2(int num) {
		System.out.println("roll number"+num);
	}
	public void n3(String name) {
		System.out.println("Name:"+name);
	}
	public void n4(String nam,int roll, char grade) {
		System.out.println("name:"+nam+""+"roll number:"+roll+" "+"Grade:"+grade);
	}
	public void n5(float f,double d) {
		System.out.println(f+d);
	}
	public static void main(String[] args) {
		Methods3 m=new Methods3();
		m.n1();
		m.n2(10991);
		m.n3("Yaseen");
		m.n4("Mohammad",110010991,'A');
		m.n5(75.04f, 145.53);
	}

}
