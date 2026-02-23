package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberStreamsTest {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,3,7,8,23,56,7,90,40,23,67,9,26,2,12);
		list.stream()
		    .filter(x->x%2==0)//condition
		    .map(x->x*5)//logic
		    .sorted()//sorting in order
		    .distinct()//remove duplicates
		    .limit(3)//limited content
		    .skip(1)
		    .forEach(x->System.out.println(x));
		System.out.println("=======================");
		
		list.stream().forEach(x->System.out.println(x));
		
		System.out.println("=========collect===========");
		List<Integer> oddlist=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(oddlist);
		
		System.out.println("=========min=======");
		int min=list.stream().mapToInt(x->x).min().getAsInt();
		System.out.println(min);
		
		System.out.println("========max======");
		int  max=list.stream().mapToInt(x->x).max().getAsInt();
		System.out.println(max);
		
		System.out.println("=======count========");
		long count=list.stream().count();
		System.out.println(count);
		
		System.out.println("=======sum=====");
		 long sum=list.stream().mapToInt(x->x).sum();
		 System.out.println(sum);
		 
		 System.out.println("=======match operations========");
		 boolean anymatch=list.stream().anyMatch(x->x==2);
		 System.out.println(anymatch);
		 
		 boolean allmatch=list.stream().allMatch(x->x<100);
		 System.out.println(allmatch);
		 
		 boolean nonematch=list.stream().noneMatch(x->x==2);
		 System.out.println(nonematch);
		 
		 System.out.println("==========find operation=====");
		 Optional<Integer> findany=list.stream().findAny();
		 System.out.println(findany);
		 
		 Optional<Integer> findfirst=list.stream().findFirst();
		 System.out.println(findfirst);
	}

}
