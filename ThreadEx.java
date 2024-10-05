package com.threadrevision;

class Multi extends Thread
{
	public void run()
	{
		System.out.println("my first thread");
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		
		Multi m1 = new Multi();
		m1.run();

	}

}
