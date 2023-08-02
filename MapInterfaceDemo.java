package com.kaviya.collection.framework;

//HashMap--------not synchronized -- multiple threads can able to access at a time

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Hashtable;

// Hashtable---- synchronized it is thread safe
public class MapInterfaceDemo {
	public static void main(String... args) {
		Map<String, String> map = new Hashtable<>();
		map.put("Language", "Java");
		map.put("Next Topic", "JSP");
		map.put("Will Learn", "SQL");
		map.put("Language", "core Java");
		Set<String> keys = map.keySet();

		for (String eachKeys : keys) {
			System.out.println(eachKeys + " :   " + map.get(eachKeys));
		}
	}

}
