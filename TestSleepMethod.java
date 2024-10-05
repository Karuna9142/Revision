package com.threadrevision;

class ThreadSleep extends Thread
{
	public void run()
	{
		for(int i = 1; i<6; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}
	
	
}
public class TestSleepMethod {

	public static void main(String[] args) {
	
		ThreadSleep s1 = new ThreadSleep();
		ThreadSleep s2 = new ThreadSleep();
		
		s1.start();
		s2.start();

	}

}
