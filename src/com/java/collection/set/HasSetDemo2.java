package com.java.collection.set;

import java.util.HashSet;

public class HasSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs1= new HashSet<>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		hs1.add(6);
		System.out.println(hs1);
		HashSet<Integer> hs2= new HashSet<>();
		hs2.add(2);
		hs2.add(5);
		//hs2.add(7);
		hs2.add(6);
		System.out.println(hs2);
		
		//union
		//hs1.addAll(hs2);
		//System.out.println("Union: " +hs1);
		
		//intersection mens common element
		//hs1.retainAll(hs2);
		//System.out.println(hs1);
		
		//Difference 
		//hs1.removeAll(hs2);
		//System.out.println(hs1);
		
		//subset
		hs1.containsAll(hs2);
		System.out.println(hs1);

	}

}
