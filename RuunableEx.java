package com.threadrevision;

class MyThread implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Now the thread is running");
	}
	
}
public class RuunableEx {

	public static void main(String[] args)
	{
		
		Runnable r1 = new MyThread();
		Thread t1 = new Thread(r1, "My new Thread");
		
		t1.start();
		
		String str = t1.getName();
		System.out.println(str);
		

	}

}
