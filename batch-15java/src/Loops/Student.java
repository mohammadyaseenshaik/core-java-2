package Loops;

public class Student {
	public void result(int marks) {
		if(marks>34 && marks<=50) {
			System.out.println("Grade-C");
		}else if(marks>50 && marks<=75) {
			System.out.println("Grade-B");
		}else if(marks>75 && marks<=100) {
			System.out.println("Grade-A");
		}
		else {
			System.out.println("student fail...");
		}
	}
	public static void main(String[] args) {
		Student d=new Student();
		d.result(25);
	}

}
