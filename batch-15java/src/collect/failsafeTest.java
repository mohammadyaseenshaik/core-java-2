package collect;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class failsafeTest {
	public void onmap() {
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		map.put(102,"yaseen");
		map.put(103,"teja");
		map.put(104,"sai");
		map.put(105,"manjith");
		for(Entry<Integer, String> entry:map.entrySet()) {
			if(entry.getKey()==103) {
				map.put(108, "qwdf");
			}
			System.out.println(entry);
		}
		
		
	}
	public void onlist() {
		List<Integer> li=new CopyOnWriteArrayList<Integer>();
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		for(Integer i:li) {
			if(i==12) {
				li.remove(0);
			}
			System.out.println(i);
			
		}
		
	}
	public void ontree() {
		Map<String, Integer> map=new TreeMap<String,Integer>();
		map.put("yasen", 101);
		map.put("nagendra", 103);
		map.put("yesu", 104);
		for(Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getKey()=="yaseen") {
				
			}
			System.out.println(entry);
		}
		
	}
	public void onset() {
		Set<Integer> s=new HashSet<Integer>();
		
		}
	public static void main(String[] args) {
		failsafeTest a=new failsafeTest();
		//a.onmap();
		//a.onlist();
		a.ontree();
	}

}
