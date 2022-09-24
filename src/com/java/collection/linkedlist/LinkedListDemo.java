package com.java.collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
//		LinkedList ll=new LinkedList();
//		
//		ll.add(0,"Ashutosh");
//		ll.add(1,"Nikhil");
//		ll.add(2,23);
//		ll.add(3, 45.5);
//		ll.add(4, "c");
//		ll.add(5, "c");
//		ll.add(6, null);
//		ll.add(7, null);
//		
//		System.out.println(ll);
		
		
		ArrayList al= new ArrayList();
		al.add(200);
		al.add(300);
		al.add(400);
        LinkedList ll1=new LinkedList(al);
		
		ll1.add(0,"Ashutosh");
		ll1.add(1,"Nikhil");
		ll1.add(2,23);
		ll1.add(3, 45.5);
		ll1.add(4, "c");
		ll1.add(5, "c");
		ll1.add(6, null);
		ll1.add(7, null);
		System.out.println(ll1);
		
		
//		System.out.println(ll.contains(23));
//		
//		ll.addFirst("aaa");
//		
//		System.out.println(ll);
//		ll.addLast("ddd");
		//ll.removeFirst();
		//ll.removeLast();
		
		//System.out.println(ll);

	}

}
