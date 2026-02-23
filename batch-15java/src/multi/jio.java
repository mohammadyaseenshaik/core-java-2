package multi;
 
public class jio extends Thread{
	@Override
	public void run() {
		System.out.println("Run method.. ");
		
	}
	public static void main(String[] args) {
		jio j=new jio();
		//j.run();
		Thread tt=new Thread(j);
		tt.start();
	}
 
}