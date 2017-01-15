/**
 * 
 */
package com.java.learning.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



/**
 * @author Kiran
 *
 */
public class ArrayListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 List<String> names = new CopyOnWriteArrayList<String>();
		 names.add("kiran");
		 names.add("hs");
		 names.add("chaithra");
		 
		 Iterator<String> it = names.iterator();
		 
		 while(it.hasNext())
		 {
			 String name = it.next();
			 System.out.println("name:"  + name);
			 names.remove(0);
		 }
		 List<String> names1 = new ArrayList<String>();
		 names1.add("kiran");
		 names1.add("hs");
		 names1.add("chaithra");
		 
		 Iterator<String> it1 = names1.iterator();
		 
		 while(it1.hasNext())
		 {
			 String name = it1.next();
			 System.out.println("name:"  + name);
			 names1.remove(0);
		 }
		 
		 

	}

}
