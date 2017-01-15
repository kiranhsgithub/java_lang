/**
 * 
 */
package com.americanexpress.kiran1;

/**
 * @author Kiran
 *
 */
public class RunnableImplTester1 implements Runnable{
	
	Thread t;
	
	RunnableImplTester1()
	{
		t = new Thread(this,"TesterThread");
		System.out.println(" RunnableImplTester1 Child thread n Constructor"  + t);
		
	}
	
	public void run()
	{
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println(" Child Thread " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(" RunnableImplTester1 child thread interrupted");
		}
		System.out.println("Exiting RunnableImplTester1 child thread");
	}
	
	public void start()
	{
		t.start();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RunnableImplTester1 r = new RunnableImplTester1();
		r.start();
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println(" Main Thread:" + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println(" Main thread interrupted");
		}
		System.out.println("Exiing main thread");
	}

}
