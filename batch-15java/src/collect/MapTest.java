package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	public void hashMapTest() {
		//  key       value
		Map<String, String> map=new HashMap<String, String>();
		map.put("AWET23RFG", "YASEEN");//entry
		map.put("BWET23RFG", "SAI");
		map.put("CWET23RFG", "TEJA");
		map.put("DWET23RFG", "MANJITH");
		map.put("eWET23RFG", "YASEEN");
		for(Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry);
		}
		
		
		
	}
	public void linkedhashMap() {
		Map<String, String> map=new LinkedHashMap<String, String>();
		map.put("AWET23RFG", "YASEEN");//entry
		map.put("BWET23RFG", "SAI");
		map.put("CWET23RFG", "TEJA");
		map.put("DWET23RFG", "MANJITH");
		map.put("eWET23RFG", "YASEEN");
		map.put(null, "YASEEN");
		
		for(Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry);
		}
		
	}
	public void treeHashMap() {
		Map<String, String> map=new TreeMap<String, String>();
		map.put("AWET23RFG", "YASEEN");//entry
		map.put("bWET23RFG", "SAI");
		map.put("CWET23RFG", "TEJA");
		map.put("DWET23RFG", "MANJITH");
		map.put("eWET23RFG", "YASEEN");
		//map.put(null, "YASEEN");
		map.put("eWET23RFG", null);
		
		for(Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry);
		}
	}
	public void hashtableTest() {
		Map<String, Integer> map=new Hashtable<String, Integer>();
		map.put("AWET23RFG", 101);//entry
		map.put("BWET23RFG", 102);
		map.put("CWET23RFG", 106);
		map.put("DWET23RFG", 103);
		map.put("eWET23RFG", 105);	
		//map.put(null,null); //it doesn't allow both key null and value null 
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
			//System.out.println(entry);
		}
	}
public static void main(String[] args) {
	MapTest mt=new MapTest();
	//mt.hashMapTest();
	//mt.treeHashMap();
	//mt.linkedhashMap();
	mt.hashtableTest();
}
}
