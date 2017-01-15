/**
 * 
 */
package com.java.learning.one;

/**
 * @author Kiran
 *
 */
public class TheadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("Thread t:" + t);
		
		t.setName("my thread");
		
		System.out.println("After name change t:" + t);
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
				
			}
		}catch(InterruptedException ie)
		{
			System.out.println("interrupted");
		}
		

	}

}
