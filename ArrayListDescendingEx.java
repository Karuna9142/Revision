package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescendingEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(0);
		a1.add(10);
		a1.add(3);
		a1.add(5);
		a1.add(22);
		a1.add(10);
		
		System.out.println("Original List:- "+a1);
		
		//Sort
		Collections.sort(a1);
		System.out.println("Ascending order:- "+a1);
		
		//Descending
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("Descending order:- "+a1);
		

	}

}
