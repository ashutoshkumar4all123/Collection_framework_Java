package com.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		//HashSet hs = new HashSet();//default capacity =16, load factor = 0.75
		//HashSet hs = new HashSet(100);
		//HashSet hs = new HashSet(100,(float) 0.75);
		//HashSet<Integer> hs1 = new HashSet<>();
//		hs.add("Ashutosh");
//		hs.add(100);
//		hs.add(16.5);
//		hs.add(null);
//		hs.add('b');
//		hs.add(true);
//		System.out.println(hs);
//		hs.remove(16.5);
//		System.out.println(hs);
//		System.out.println(hs.contains("xyz"));
//		for(Object e : hs) {
//			System.out.println(e);
//		}
		
//		Iterator itr= hs.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		HashSet<Integer> evenNumbers=new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println(evenNumbers);
		
		HashSet<Integer> numbers= new HashSet<>();
		numbers.add(5);
		numbers.addAll(evenNumbers);
		System.out.println(numbers);
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);
		
	}

}
