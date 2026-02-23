package functional;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> f1=new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		Integer val=f1.apply("yaseen");
		System.out.println(val);
		Function<String, Integer> f2= t  ->t.length();
			
	
		Integer val1=f2.apply("rafan");
		System.out.println(val1);
	}

}
