package com.java.collection.crussior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {
	public static void main(String[] args) {
		List l= new ArrayList();
		l.add(10);
		l.add("Ashutosh");
		l.add("Ram");
		
     	ListIterator  li= l.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
		li.next();
		li.next();
		//li.next();
		
		//System.out.println("-------------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//li.add("Nikhil");
		//seting from 1st bcause we are performing previous crusior
		li.set(200);
		System.out.println(l);
	}

}
