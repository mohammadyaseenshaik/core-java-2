package functional;

import java.util.concurrent.Callable;

public class CallableTest{
	public static void main(String[] args) throws Exception {
		Callable<String> f1=new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "yaseen";
			}
		};	
		String val=f1.call();
		System.out.println(val);
		System.out.println("=================");
		
Callable<Integer> f2=()-> 5*5;	
		Integer val1=f2.call();
		System.out.println(val1);
		
		
		
	}

}
