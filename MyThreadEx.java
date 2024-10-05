package com.threadrevision;

public class MyThreadEx {

	public static void main(String[] args) {
		
		Thread t = new Thread("Thread is running");
		
		t.start();
		
		//getting the thread name by invoking the getname()
		String str = t.getName();
		System.out.println(str);

	}

}
