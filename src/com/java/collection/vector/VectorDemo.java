package com.java.collection.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		 Vector v = new Vector();
		 
		 v.add("Ashutosh");
		 v.add(1, "nikhil");
		 v.addElement(20);
		 v.add(10.5);
		 v.add('c');
		 v.add("Ashutosh");
		 v.add(null);
		 v.add(null);
		 
		 System.out.println(v);
		 //System.out.println(v.lastElement());
		// System.out.println(v.firstElement());
		 
		//System.out.println( v.capacity());
		 //v.removeElementAt(0);
		 v.setElementAt("Manish", 5);
		 v.setSize(7);
		 System.out.println(v.capacity());
		 System.out.println(v);

	}

}
