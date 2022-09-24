package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
//		Collection<String> fruitCollection= new ArrayList<>();
//		fruitCollection.add("Apple");
//		fruitCollection.add("Banana");
//		fruitCollection.add("Mango");
//		System.out.println(fruitCollection);
//		//remove elements
//		fruitCollection.remove("Banana");
//		System.out.println(fruitCollection);
//		
//		// to check element
//		System.out.println(fruitCollection.contains("Apple"));
//		
//		fruitCollection.forEach((element) -> {
//			System.out.println(element);
//		});
//		
//		System.out.println(fruitCollection.containsAll(fruitCollection));
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
//		System.out.println(al);
//		System.out.println(al.add("ddd"));
		ArrayList al1 = new ArrayList();
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		
		ArrayList al2 = new ArrayList();
		al2.add("aaa");
		al2.add("ddd");
		al2.add("eee");
//		System.out.println(al1);
//		
//		al.addAll(al1);
//		System.out.println(al);
//		
//		System.out.println(al.contains(600));
//
//		System.out.println(al.isEmpty());
//		System.out.println(al.size());
	     
//		System.out.println(al);
//		al.remove(0);
		System.out.println(al1);
		al1.removeAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al);
		al.clear();
		System.out.println(al);

	}

}
