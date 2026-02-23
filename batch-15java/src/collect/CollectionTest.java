package collect;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(19);
		list.add(13);
		list.add(9);
		Collections.sort(list);
		Collections.reverse(list);
		for(Integer i:list) {
			System.out.println(i);
		}
		Object[] objArr=list.toArray();
		List<Object> objlist=Arrays.asList(objArr);
		Map<Integer, String> map=new HashMap<Integer, String>();
		Map<Integer, String> synMap= Collections.synchronizedMap(map);
		
	    List<Integer>  synlist=Collections.synchronizedList(list);
	    
		Set<Integer>  set=new HashSet<Integer>();
		Set<Integer>  synset=Collections.synchronizedSet(set);
		List<Integer> unmodifylist=new List<Integer>(list);
	}

}
