/**
 * 
 */
package com.americanexpress.kiran1;

/**
 * @author Kiran
 *
 */
 class Callme{

	public  void  call(String msg)
	{
		System.out.print("[" + msg );
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println(" Interrupted");
		}
		System.out.println("]");
	}
}

public class Caller implements Runnable
{
	Thread t;
	Callme target;
	public Caller(Callme target,String name)
	{
		t = new Thread(this,name);
		this.target = target;
		t.start();
	}

	public void run()
	{
		synchronized(target){
			target.call(t.getName());
		}
		
	}

	public static void main(String[] args)
	{
		Callme target = new Callme();
		Caller c1 = new Caller(target,"Hello");
		Caller c2 = new Caller(target,"Synchronized");
		Caller c3 = new Caller(target,"World");

	}
}
