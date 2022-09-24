package com.java.collection;

public class NeedOfCollection {

	public static void main(String[] args) {
		
		int a= 10;
		int b = 20;
		/*
		 .
		 .
		 .
		 .
		 If data is big so it is difficult to store data like this
		 so Array come in picture
		 */
        int [] arr= {1,2,3};
        
        Student[] students= new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
       // students[0] = new Book();
        
        Object[] objects= new Object  [10];
        objects[1] = new Book();
	}
	
	

}
class Book{
	
}

class Student{
	
}
