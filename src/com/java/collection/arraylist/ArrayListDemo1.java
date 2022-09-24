package com.java.collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al2 = new ArrayList();
//		al2.add(20);
//		al2.add(10);
//		al2.add(40);
//		al2.add(60);
//		al2.add(50);
		
		// can also add like this
		al2.add(0, 20);
		al2.add(1, "Ashutosh");
		al2.add(2, 'b');
		al2.add(3, 60.05);
		al2.add(4, 50);
		al2.add(5, 20);
		al2.add(6, null);
		al2.add(7, null);
		System.out.println(al2);
		//System.out.println(al2.set(0, 30));
//		System.out.println(al2.isEmpty());
//		System.out.println(al2);
//		ArrayList al = new ArrayList();
//		al.add(20);
//		al.add(50);
//		al.add(90);
		
		//al2.removeAll(al);
		
		System.out.println(al2);
		
		//al2.clear();
		System.out.println(al2);
		System.out.println(al2.get(7));
		
		
//		
//		ArrayList al1 = new ArrayList(6);
//		0
//		ArrayList al3= new ArrayList(al2);
		

	}

}
