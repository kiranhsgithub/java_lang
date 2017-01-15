/**
 * 
 */
package com.java.learning.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author Kiran
 *
 */
public class SynchrinizedCollectionsTest implements Runnable{

	private Thread t;
	List<String> students;
	
	public void run()
	{
		Thread t= new Thread();
		try {
			t.wait(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 List<String> names1 = new ArrayList<String>();
		 names1.add("kiran");
		 names1.add("hs");
		 names1.add("chaithra");
		 
		 List<String> syncNames = Collections.synchronizedList(new ArrayList<String>());
		 syncNames.add("kiran");
		 syncNames.add("hs");
		 syncNames.add("chaithra");
		 
		 Iterator<String> it1 = syncNames.iterator();
		 
		 while(it1.hasNext())
		 {
			 String name = it1.next();
			 System.out.println("name:"  + name);
			 syncNames.remove(0);
		 }
		
	}

}
