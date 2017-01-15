/**
 * 
 */
package com.java.learning.one;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kiran
 *
 */
public class ThreadDemo {

	

	/**
 * @param args
 */
	public static void main(String[] args) {
		
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.t.start();
		c.t.start();

	}

}

class Producer implements Runnable
{
	Q q;
	Thread t;
	public Producer(Q q)
	{
		this.q = q;
		t = new Thread(this,"Producer");
System.out.println("Producer Thread COnstructor" + t);
}

public void run()
{
	int i = 0;
	while(true)
	{
		
		q.put(i++);
		
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Interrupted");
//			}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	Thread t;
	public Consumer(Q q)
	{
		this.q = q;
		t = new Thread(this,"Consumer");
	
}

public void run()
{
	
	while(true)
	{
		int k = q.get();
//			System.out.println("Book removed" + k);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Interrupted");
//			}
		}
	}
}

class Book{
	
	String name;
	String author;
	int price;
	public Book(String name,String author,int price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	
}

class Q
{
	int n;
	boolean isValueAdded;

	
	public synchronized int get()
	{
		while(!isValueAdded)
		{
			try {
				wait();
} catch (InterruptedException e1) {
				System.out.println("Wait interrupted");
	}
}
System.out.println("Got:" + n);
	isValueAdded = false;
	notify();
	return n;
}

public synchronized void put(int item)
{
	while(isValueAdded)
	{
		try {
			wait();
		} catch (InterruptedException e1) {
			System.out.println("Wait interrupted");
	}
}
n = item;
isValueAdded = true;
System.out.println("Put:" + n);
		notify();
		
	}
}