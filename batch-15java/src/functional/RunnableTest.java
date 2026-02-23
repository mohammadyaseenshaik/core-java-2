package functional;

public class RunnableTest {
public static void main(String[] args) {
	Runnable f1=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("yaseen");
			
		}
	};
	f1.run();
Runnable f2=() -> System.out.println("manjith");
	f2.run(); 
}

}
