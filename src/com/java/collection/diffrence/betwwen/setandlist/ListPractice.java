package com.java.collection.diffrence.betwwen.setandlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPractice {

	public static void main(String[] args) {
	    List l= new ArrayList();
	    //idex basd data structure
	    l.add(10);
	    l.add(20);
	    l.add(40);
	    l.add(30);
//	    l.add(null);
//	    l.add(null);
//	    System.out.println(l);
	    
//	    Iterator itr= l.iterator();
//	    while(itr.hasNext()) {
//	    	System.out.println(itr.next());
//	    }
	    ListIterator itr= l.listIterator();
	    while(itr.hasPrevious()) {
	    	System.out.println(itr.hasPrevious());
	    }
	}

}
