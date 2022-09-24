package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
     public static void main(String[] args) {
    	 
    	 List<Integer> fristFivePrimeNumbers= new ArrayList<>();
    	 fristFivePrimeNumbers.add(2);
    	 fristFivePrimeNumbers.add(3);
    	 fristFivePrimeNumbers.add(5);
    	 fristFivePrimeNumbers.add(7);
    	 fristFivePrimeNumbers.add(11);
    	 
    	 List<Integer> fristTenPrimeNumbers= new ArrayList<>(fristFivePrimeNumbers);
    	 
    	 List<Integer> nextPrimeNumbers= new ArrayList<>();

    	 nextPrimeNumbers.add(13);
    	 nextPrimeNumbers.add(17);
    	 nextPrimeNumbers.add(19);
    	 nextPrimeNumbers.add(2);
    	 nextPrimeNumbers.add(29);
    	 
    	fristTenPrimeNumbers.addAll(nextPrimeNumbers);	
    	
    	System.out.println(fristTenPrimeNumbers);
		
	}
}
