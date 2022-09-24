package com.java.collection.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<>();
		
	ArrayList<Integer> al= new ArrayList<>();
	al.add(50);
	al.add(20);
	al.add(40);
	al.add(30);
	al.add(60);
	al.add(10);
	al.add(10);
	System.out.println(al);
	ts.addAll(al);
	System.out.println(ts);
	
	ts.add(1);
	ts.add(2);
	ts.add(4);
	System.out.println(ts.size());
	System.out.println(ts);
	System.out.println(ts.first());
	System.out.println(ts.last());
	ts.pollFirst();
	ts.pollLast();
	System.out.println(ts);
	System.out.println(ts.first());
	System.out.println(ts.last());
		ts.remove(5);
		ts.remove(4);
		System.out.println(ts);
		ts.clear();
		System.out.println(ts);
	}

}
