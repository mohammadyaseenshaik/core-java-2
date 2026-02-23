package collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public void hashSetTest() {
		Set<Integer> set=new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(15);
		set.add(18);
		set.add(null);
		//set.add(12); it doesn't allow duplicates
		for(Integer i:set) {
			System.out.println(i);
		}	
	}
	public void linkedHashSetTest() {
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(15);
		set.add(18);
		set.add(null);
		
		for(Integer i:set) {
			System.out.println(i);
		}
		
	}
	public void treeHashSetTest() {
		Set<Integer> set=new TreeSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(15);
		set.add(18);
		//set.add(null); treehashset is not allow null
		
		for(Integer i:set) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		SetTest a=new SetTest();
		a.hashSetTest();
		//a.linkedHashSetTest();
		//a.treeHashSetTest();
	}

}
