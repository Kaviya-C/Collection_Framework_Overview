package com.kaviya.collection.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
// ctrl+shift+o --- import all the packages
public class CollectionDemo 
{
	public static void main(String...args) 
	{
		Collection<Integer> values=new ArrayList<>();
		values.add(34);
		values.add(90);
		values.add(12);
		values.add(19);

// Collection is an interface does not support with index number 
// so we can go with iterator
		
		Iterator it=values.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
	}

}
