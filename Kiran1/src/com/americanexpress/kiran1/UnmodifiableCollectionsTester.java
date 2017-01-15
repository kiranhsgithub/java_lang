/**
 * 
 */
package com.americanexpress.kiran1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Kiran
 *
 */
public class UnmodifiableCollectionsTester extends Thread{

	List<String> names2;
	
	public UnmodifiableCollectionsTester()
	{
		names2 = new ArrayList<String>();
		
	}
	public void run()
	{
		names2.remove("kiran");
		names2.add("anasuya");
		System.out.println("Run :" + names2.size() + names2);
		names2.add("shankar");
		names2.add("kiran");
		System.out.println("Run :" + names2.size() + names2);
		 names2.add("hs");
		 names2.add("chaithra");
		 System.out.println("Run :" + names2.size() + names2);
		 names2.add("kiran");
		 names2.add("hs");
		 System.out.println("Run :" + names2.size() + names2);
		 names2.remove("chaithra");
		 names2.remove("kiranq");
		 names2.remove("hsq");
		 System.out.println("Run :" + names2.size() + names2);
		 names2.remove("chaithraq");
		 names2.remove("kiranw");
		 names2.remove("hsw");
		 System.out.println("Run :" + names2.size() + names2);
		 names2.remove("chaithraw");
		 names2.remove("kirane");
		 names2.add("hse");
		 names2.add("chaithrar");
		System.out.println("Run :" + names2.size() + names2);
		
	}
	
	public List<String> getList()
	{
		return names2;
	}
	
	public void setList(List<String> li)
	{
		names2 = li;
		names2.add("kiran");
		 names2.add("hs");
		 System.out.println("Run :" + names2.size() + names2);
		 names2.add("chaithra");
		 names2.add("kiran1");
		 System.out.println("Run :" + names2.size() + names2);
		 names2.add("hs1");
		 System.out.println("Run :" + names2.size() + names2);
		
		 names2.add("chaithra1");
		 names2.remove("kiran2");
		 System.out.println("Run :" + names2.size() + names2);
			names2.remove("anasuya3");
			names2.remove("shankar3");
			System.out.println("Run :" + names2.size() + names2);
			names2.remove("kiran3");
			System.out.println("Run :" + names2.size() + names2);
			 names2.add("hs5");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> names1 = new ArrayList<String>();
		 names1.add("kiranq");
		 names1.add("hsq");
		 System.out.println("Run :" + names1.size() + names1);
		 names1.add("chaithraq");
		 names1.add("kiranw");
		 System.out.println("Run :" + names1.size() + names1);
		 names1.add("hsw");
		 System.out.println("Run :" + names1.size() + names1);
		 names1.add("chaithraw");
		 names1.add("kirane");
		 System.out.println("Run :" + names1.size() + names1);
		 names1.add("hse");
		 names1.add("chaithrar");
		 
		UnmodifiableCollectionsTester um = new UnmodifiableCollectionsTester();
		um.start();
		
		List<String> localList = um.getList();
		localList.remove("kiran");
		
		um.setList(names1);
		
		
		
		
		 
		 List<String> names1Unmodifiable = Collections.unmodifiableList(names1);
		 
		// names1Unmodifiable.add("anasuya");
		 System.out.println("names1Unmodifiable" + names1Unmodifiable);
		 
		

	}

}
