/**
 * 
 */
package com.americanexpress.kiran1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Kiran
 *
 */
public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Account> set = new HashSet<Account>();
		
		long begin1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			Account a = new Account(i);
			set.add(a);
		}
		long putTime = System.currentTimeMillis() - begin1;
		
//		long begin = System.currentTimeMillis();
//		for(Account a:set)
//		{
//			System.out.println("Account:" + a + " value:" + set.get(a));
//		}
//		long getTime = System.currentTimeMillis() - begin;
		System.out.println("Time taken putTime:" + putTime);
		
		System.out.println("Set size:" + set.size());
		
		

	}

}
