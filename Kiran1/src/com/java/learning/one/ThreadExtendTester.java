/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
	
public class ThreadExtendTester extends Thread{

	public ThreadExtendTester(String name)
	{
		super(name);
		System.out.println(" Child thread constructor" + this);
		
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(this.getName() + i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e)
		{
			System.out.println(" CHild thread interrupted");
		}
		System.out.println("Exiting child thread" + this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadExtendTester tr1 = new ThreadExtendTester("ThreadOne ");
		tr1.setPriority(Thread.MAX_PRIORITY);
		
//		ThreadExtendTester tr2 = new ThreadExtendTester("ThreadTwo ");
//		tr1.setPriority(Thread.MIN_PRIORITY);
//	
//		ThreadExtendTester tr3 = new ThreadExtendTester("ThreadThree ");
//		tr1.setPriority(Thread.NORM_PRIORITY);
		
//		Thread t = Thread.currentThread();
//		t.setPriority(Thread.MAX_PRIORITY);
		

		System.out.println("tr1 " + tr1);
//		System.out.println("tr2 " + tr2);
//		System.out.println("tr3 " + tr3);
		System.out.println("t " + Thread.currentThread());
		
		tr1.start();
//		tr2.start();	
//		tr3.start();
	 
		System.out.println("tr1 isAlive" + tr1.isAlive());
//		System.out.println("tr2 isAlive" + tr2.isAlive());
//		System.out.println("tr3 isAlive" + tr3.isAlive());

		
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main thread " + i);
				Thread.sleep(100);
			}
//			//Thread.currentThread().join();
//			tr2.join();
//			tr3.join();
			tr1.join();

		}catch(InterruptedException e)
		{
			System.out.println(" Main thread interrupted");
		}
		System.out.println("Exiting Main thread" + Thread.currentThread());
		

	}

}
