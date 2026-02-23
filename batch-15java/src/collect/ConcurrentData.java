package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import practice.staticvariable;

public class ConcurrentData {// not allow duplicates
	public void onmap() {
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		map.put(102,"yaseen");
		map.put(103,"teja");
		map.put(104,"nagendra");
		map.put(106,"manjith");
		for(Entry<Integer, String>entry:map.entrySet()) {
			map.put(109,"qwer");
			map.remove(103);
			System.out.println(entry);	
		}
		System.out.println("==========");
		for(Entry<Integer, String>entry:map.entrySet()) {
			
			System.out.println(entry);	
		}
	}
	public void onlist() {  ///list allows duplicates
		List<Integer> li=new CopyOnWriteArrayList<Integer>();
		li.add(12);
		li.add(13);
		li.add(147);
		li.add(156);
		for(Integer i:li) {
			if(i==156) {
			li.add(12);
			}
			System.out.println(i);
		}
		for(Integer i:li) {
			System.out.println(i);
		}
		
		
	}
	public void onset() { //set doesn't allow duplicates
		Set<Integer> set=new CopyOnWriteArraySet<Integer>();
		set.add(123);
		set.add(456);
		set.add(789);
		set.add(127);
		for(Integer i:set) {
			set.add(188);
			System.out.println(i);
		}
		System.out.println("=======");
		for(Integer i:set) {
			
			System.out.println(i);
		}
		
			
		
	}
public static void main(String[] args) {
		ConcurrentData a=new ConcurrentData();
		a.onmap();
		//a.onlist();
		//a.onset();
	}

}
