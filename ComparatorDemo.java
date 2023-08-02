package com.kaviya.collection.framework;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String... args) {
		List<Integer> values = new ArrayList<>();
		values.add(902);
		values.add(435);
		values.add(900);
		values.add(334);
		values.add(111);
		values.add(243);
		Comparator<Integer> c = (i, j) -> i % 10 > j % 10 ? 1 : -1;

		Collections.sort(values, c);
		for (int element : values) {
			System.out.println(element);
		}
	}
}
