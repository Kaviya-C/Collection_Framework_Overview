package com.kaviya.collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// If we use Collection interface as Reference then we 
//are not able to insert the element in the middle

// List
public class ListInterface {
	public static void main(String... args) {

// list is mutable		

		List<Integer> values = new ArrayList<>();
		values.add(100);
		values.add(672);
		values.add(301);
		values.add(404);
		values.add(2, 253);
		// Comparator comp=new Comparator();

		Collections.sort(values);
		Collections.reverse(values);
		Collections.shuffle(values);

		for (int element : values) {
			System.out.println(element);
		}
		System.out.println("------------");
		System.out.println(values.get(3));
		/*
		 * Iterator it=values.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */

	}

}
