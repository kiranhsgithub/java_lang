/**
 * 
 */
package com.americanexpress.kiran1;

/**
 * @author Kiran
 *
 */
public class RunnableImplTester implements Runnable{
	
	Thread t;
	
	RunnableImplTester()
	{
		t = new Thread(this,"TesterThread");
		System.out.println(" RunnableImplTester Child thread n Constructor"  + t);
		t.start();
	}
	
	public void run()
	{
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println(" Child Thread " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println(" RunnableImplTester child thread interrupted");
		}
		System.out.println("Exiting RunnableImplTester child thread");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RunnableImplTester r = new RunnableImplTester();
		
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println(" Main Thread:" + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(" Main thread interrupted");
		}
		

	}

}
