package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AccessElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Check Arry is empty or not(isEmpty)
		
		List<String> topProgramingLanguage=new ArrayList<>();
		
		System.out.println("Is the topProgramingLanguage list Empty: " + topProgramingLanguage.isEmpty());
		
		topProgramingLanguage.add("C");
		topProgramingLanguage.add("C++");
		topProgramingLanguage.add("Java");
		topProgramingLanguage.add("Python");
		topProgramingLanguage.add("Javascript");
		//size of array
		System.out.println("Here is the top :  "  + topProgramingLanguage.size() + "  Programing laguage in the world");
		 // 
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add("Ashutosh");
		ar.add("c");
		System.out.println(ar);
		
		LinkedList ls= new LinkedList();
		List lis= new ArrayList();
		List lis1=new LinkedList();
		HashMap hs= new HashMap();
		hs.put(100,"Ram");
		hs.put("Ram", 202);
		System.out.println(hs);
		
	}

}
