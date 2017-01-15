/**
 * 
 */
package com.americanexpress.kiran1;

/**
 * @author Kiran
 *
 */
public class ThreadsNewResume implements Runnable {

	boolean suspendFlag;
	String name;
	Thread t;
	
	public ThreadsNewResume(String name)
	{
		t = new Thread(this,name);
		this.name = name;
		System.out.println(" New hread" + t);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try{
			for(int i=15; i>0 ; i--)
			{
				System.out.println(name + ":" + i);
				Thread.sleep(100);
				synchronized(this){
					while(suspendFlag){
						wait();
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println(" Thread interruoted" + e);
		}
		System.out.println(name + "exiting");
	}
	
	
	public void suspend()
	{
		suspendFlag = true;
	}
	
	public synchronized void resume()
	{
		suspendFlag = false;
		notify();
	}
	
	public void start()
	{
		t.start();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadsNewResume t1 = new ThreadsNewResume("One");
		ThreadsNewResume t2 = new ThreadsNewResume("Two");
		
		try{
			Thread.sleep(1000);
			t1.start();
			t2.start();
			t1.suspend();
			System.out.println("Suspending thread 1");
			Thread.sleep(1000);
			t1.resume();
			System.out.println("Resuming thread 1");
			t2.suspend();
			System.out.println("Suspending thread 2");		
			Thread.sleep(1000);
			t2.resume();
			System.out.println("Resuming thread 2");	
			
			
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted block1");
		}
		
		try{
			System.out.println("Waiting for threads to finish");
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted block 2");
		}
		System.out.println("Main Thread exiting");
		
		

	}

	public void join() throws InterruptedException {		
		t.join();
	}

}
