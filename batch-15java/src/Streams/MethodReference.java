package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,3,7,8,6,14);
		              list.stream()
		                  .filter(x->x%2==0)
		                  .map(x->x+2)
		                  .forEach(System.out::println);
		              System.out.println("======static method====");
		              //using lamda
		              list.stream()
		              .filter(x->Reference.even(x))
		              .map(x->Reference.add(x))
		              .forEach(System.out::println);
		              
		              list.stream()
		              .filter(Reference::even)
		              .map(Reference::add)
		              .forEach(System.out::println);
		              System.out.println("======using instance methods=====");
		              Reference ref=new Reference();
		              list.stream()
		                  .filter(x->ref.odd(x))
		                  .map(x->ref.multiply(x))
		                  .forEach(System.out::println);
		              
		              
		              list.stream()
		              .filter(ref::odd)
		              .map(ref::multiply)
		              .forEach(System.out::println);
		              System.out.println("=======arbitory method reference=======");
		              
		              List<String> list2=Arrays.asList("ramu","somu","suresh","ramesh","somesh");
		              list2.stream()
		                   .filter(x->x.contains("u"))
		                   .map(x->x.toUpperCase())
		                   .forEach(System.out::println);
		              
		              list2.stream()
		                   .filter(x->x.contains("u"))
		                   .map(String::toUpperCase)
		                   .forEach(System.out::println );
		              
		              System.out.println("=======new object========");
		                            //input   output
		                  Function<Integer, Student> fun=t->new Student(t);
		                  // Function<Integer, Student> fun=Student::new;
		              Student stu=fun.apply(101);
		                  System.out.println(stu);
		                  
		                  
		                  
		                  
	}

}
