package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTraditional {

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(1, 1);
		hashMap.put(5, 11);
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		hashMap.put(null, null);
		hashMap.put(6, 114);
		treeMap.put(1, 1);
		treeMap.put(1, 2);
		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
		linkedHashMap.put(null, null);
		linkedHashMap.put(6, 114);
		linkedHashMap.put(1, 1);
		linkedHashMap.put(2, 2);
		System.out.println(hashMap);
		System.out.println(treeMap);
		System.out.println(linkedHashMap);
	}

}
