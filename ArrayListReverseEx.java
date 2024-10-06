package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverseEx {
	
	static void reverseList(ArrayList<Integer> l1)
	{
		int i = 0, j = l1.size()-1;
		while(i<j)
		{
			Integer temp = Integer.valueOf(l1.get(i));
			l1.set(i, l1.get(i));
			l1.set(j, temp);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(0);
		a1.add(10);
		a1.add(3);
		a1.add(5);
		a1.add(22);
		a1.add(10);
		
		System.out.println("Original List:- "+a1);
		
		//Inbuilt method
		Collections.reverse(a1);
		
		System.out.println("After reverse:- "+a1);
		
		reverseList(a1);
		System.out.println("Reversed list:- "+a1);
		
		
		

	}

}
