/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
public class ThreadStopper extends Thread{

	public void run()
	{
		System.out.println("Running thread");
	}
	/**
	 * india_hr@exeter.com
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		
		ThreadStopper t = new ThreadStopper();
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		//t.stop();
		t.start();
		

	}

}
