package com.array;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		a1.add(10);
		
		System.out.println(a1);
		
		for(int s:a1)
		{
			System.out.println(s);
		}
		System.out.println(a1.size());
		
		//replace value
		a1.add(1,100);
		System.out.println(a1);
		
		//modify
		a1.set(1, 10);
		System.out.println(a1);
		
		//remove
		a1.remove(1);
		System.out.println(a1);
		
		a1.remove(Integer.valueOf(7));
		System.out.println(a1);
		
		//checking if an element exists or not
		boolean ans = a1.contains(Integer.valueOf(6));
		System.out.println(ans);

	}

}
