package except;

public class ExceptionTest1 {
	public void airthametic() {
		System.out.println("arithmetic start.....");
		try {
		int i=100;
		int j=0;
		int k=i/j;
		System.out.println(k);
		}catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		System.out.println("arithmetic end.....");
		
	}
	public void arrayindex() {
		System.out.println("array index start....");
		try {
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		System.out.println("array index end....");
		
	}
	public void nullpointer() {
		System.out.println("null pointer start..");
		try {
		Integer i=null;
		int j=30;
		int k=i+j;
		System.out.println(k);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("null pointer end...");
	}
	public void numberformate() {
		System.out.println("number formate start..");
		try {
		String s="123abc";
		Integer val=Integer.valueOf(s);
		System.out.println(val);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("number formate ends..");
	}
	public void interupted() {
		System.out.println("interupted start.....");
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("interupted end.....");
	}
	public void interupted2() throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ExceptionTest1 a=new ExceptionTest1();
		//a.airthametic();
		//.arrayindex();
		//a.nullpointer();
		//a.numberformate();
		//a.interupted();
		a.interupted2();
	}


}
