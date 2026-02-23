package Streams;

import java.util.Arrays;
import java.util.List;

public class FindVowelsAndConsonentsCount {
	public static void main(String[] args) {
	List<String> list=Arrays.asList("your java stop");
	list.stream()
	    .filter(x->x.contains("a||e||i||o||u"))
	    
	    .forEach(System.out::println);
	
	
		
	}
}
