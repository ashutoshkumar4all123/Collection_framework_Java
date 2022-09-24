package com.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap hm= new HashMap();
	    HashMap<Integer, String> hm= new HashMap<>();
		hm.put(101, "Ashutosh");
		hm.put(102, "Nikhil");
		hm.put(103, "Mainsh");
		hm.put(104, "Ram");
		hm.put(105, "Kumar");
		
		//System.out.println(hm);
		hm.put(105, "Shubham");
		//System.out.println(hm);
		hm.put(106, "Ashutosh");
		System.out.println(hm);
		//System.out.println(hm.get(105));
		hm.remove(104);
		System.out.println(hm);
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsValue("Ashutosh"));
		System.out.println(hm.keySet());//return set
		
//		for (Object i: hm.keySet()) {
//			System.out.println(i);
//		}
//		
		//System.out.println(hm.values());//Return collection
		
//		for(Object i : hm.values()) {
//			System.out.println(i);
//		}
//		
//		for (Object i: hm.keySet()) {
//			System.out.println(i + ":  " + hm.get(i));
//		}
		
		//System.out.println(hm.entrySet());//return all the entry as a set
		
		// Entry Methods
		//**********
//		for(Object i : hm.entrySet()) {
//			System.out.println(i);
//		}
//		
//		for(Map.Entry entry : hm.entrySet()) {
//			System.out.println(entry.getKey() + ":  "+ entry.getValue());
//		}
		
		//By iterator Method
		Set s= hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey() + ":  "+ entry.getValue());
			
			}
		System.out.println(hm.get(200));
		
		
		
	}

}
