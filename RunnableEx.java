package com.threadrevision;

// runnbale interface should be implemented by any thread
// it has only one method which is run()
class MultiEx implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Runnable thread is running...");
		
	}
	
}
public class RunnableEx {

	public static void main(String[] args) {
		MultiEx m1 = new MultiEx();
		Thread t1 = new Thread(m1);
		
		t1.start();

	}

}
