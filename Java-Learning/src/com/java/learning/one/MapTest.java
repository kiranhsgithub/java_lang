/**
 * 
 */
package com.java.learning.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kiran
 *
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Account,String> map = new HashMap<Account, String>();
		
		long begin1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			Account a = new Account(i);
			map.put(a,"Hello :" + i);
		}
		long putTime = System.currentTimeMillis() - begin1;
		
		long begin = System.currentTimeMillis();
		for(Account a:map.keySet())
		{
			System.out.println("Account:" + a + " value:" + map.get(a));
		}
		long getTime = System.currentTimeMillis() - begin;
		System.out.println("Time taken putTime:" + putTime);
		
		System.out.println("Time taken getTime:" + getTime);
		
		
		
	}

}

