package com.kaviya.collection.framework;

import java.util.Collection;
import java.util.ArrayList;
// collection is the concept
// Collections is the class
// Collection is an interface

// generics came in 1.5v

// 1.7 version we need not mention the type in right side 
public class CollectionIntro {
	public static void main(String... args) {
		// collection api

		int[] array = new int[4];

		Collection<Integer> values = new ArrayList<>();

		values.add(10);
		values.add(3);
		values.add(100);
		// values.addAll("Kaviya");
		// if i want to insert the element in the middle but we cannot
		// insert the element in middle so we can use List
		// ArrayList is a class
		// List is an interface
		// Collection is an interface
		// ArrayList implements List
// List extends Collection
		// list contains dupicate elements.. and we can accessed through
		// index and insertion order is preserved

		// Set<Integer> s=new HashSet<>()
		// set contains only unique element and order is not preserved

		// Set<Integer>s=new TreeSet<>();
		// TreeSet === sorted the value

		// Map == duplicate values are allowed
		// duplicate keys are not allowed
		// by using key we can access the values by using map

		// Map<Integer,String> m=new HashMap<>();
		// HashTable
		// one is synchronized another one is non synchronized

	}

}
