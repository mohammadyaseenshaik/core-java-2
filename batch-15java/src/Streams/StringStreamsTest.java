package Streams;


import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringStreamsTest {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("yasin","teja","manjith","sai","teja","yesu","yesu","raju","barth","nagendra");
		list.stream()
		    .filter(x->x.length()==4)
		    .map(x->x.toUpperCase())
		    .sorted()
		    .distinct()
		    .limit(2)
		    .skip(1)
		    .forEach(x->System.out.println(x));
		
		System.out.println("==================");
		list.stream().forEach(x->System.out.println(x));
		
		List<String> raju=list.stream().filter(a->a.length()==4).collect(Collectors.toList());
		System.out.println("raju"+raju);
		
		
		
//		List<String>  oddlist=list.stream().filter(x->x.length()==5).collect(Collectors.toList());
//		System.out.println(oddlist);
		
		System.out.println("=======count========");
		long count=list.stream().count();
		System.out.println(count);
		
		System.out.println("=======match operations========");
		 boolean anymatch=list.stream().anyMatch(x->x=="pooja");
		 System.out.println(anymatch);
		 
		 boolean allmatch=list.stream().allMatch(x->x.length()<2);
		 System.out.println(allmatch);
		 System.out.println("==========find operation=====");
		 Optional<String> findany=list.stream().findAny();
		 System.out.println(findany);
		 
		 Optional<String> findfirst=list.stream().findFirst();
		 System.out.println(findfirst);
		 
		}

}
