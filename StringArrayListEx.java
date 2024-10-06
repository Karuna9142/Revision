package com.array;
import java.util.ArrayList;
import java.util.Collections;

public class StringArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Karuna");
		a1.add("Smriti");
		a1.add("Harshit");
		a1.add("Abhishek");
		a1.add("Priyanshu");
		
		System.out.println("Original List:- " +a1);
		
		//Reverse
		Collections.reverse(a1);
		System.out.println("After reverse:- "+a1);

	}

}
