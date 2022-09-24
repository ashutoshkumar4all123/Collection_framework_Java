package com.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static <T> void main(String[] args) {
		HashSet<Integer> hs= new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(30);
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(30);
		
		System.out.println(lhs);
		
		LinkedHashSet<String> lhs1= new LinkedHashSet<>();
		lhs1.add("Ashutosh");
		lhs1.add("Nikhil");
		lhs1.add("Manissh");
		lhs1.add("c");
		lhs1.add("c");
		System.out.println(lhs1);
		String [] arr = new String[10];
		
		arr=lhs1.toArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
