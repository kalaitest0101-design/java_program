package javaProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "a");
		map1.put(2,"b");
		map1.put(3, "c");
		map1.put(3, null);
		System.out.println(map1);
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(1, "a");
		map2.put(2, "c");
		System.out.println(map2);
		Map<Integer, String> map3 = new TreeMap<Integer, String>();
		
		map3.put(3, "c");
		map3.put(2, "b");
		map3.put(1, "a");
		System.out.println(map3);
	}

}
