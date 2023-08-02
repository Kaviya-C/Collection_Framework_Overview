package com.kaviya.collection.framework;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String... args) {
		Set<Integer> values = new TreeSet<>();
		values.add(99);
		values.add(80);
		values.add(19);
		values.add(50);

		for (Integer eachValue : values) {
			System.out.println(eachValue);
		}

	}

}
