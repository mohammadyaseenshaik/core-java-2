package collect;

public class Student implements Cloneable {
	int id;
	String name;
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student();
		         s1.id=123;
		         s1.name="yaseen";
		         System.out.println(s1.id+" "+s1.name);
		         //its act like similar shallow class but compare performance clone class is fast and better 
		         Student s2=(Student) s1.clone();
		         System.out.println(s2.id+" "+s2.name);
		         System.out.println(s2.getClass());
	}

}     
