/**
 * 
 */
package com.java.learning.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
/**
 * @author Kiran
 *
 */
public class VarArgsTester {

//	public static void get(int i)
//	{
//		System.out.println(" get(int i) ");
//	}
//	
//	public static void get(Integer i)
//	{
//		System.out.println(" get(Integer i) wrapper");
//	}

//	public static void get(long... i)
//	{
//		System.out.println(" get(long i) ");
//	}

	public static void get(int... i)
	{
		System.out.println(" get(long i) ");
	}
	
//	public static void get(Long i)
//	{
//		System.out.println(" get(Long i) wrapper");
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		get(5);
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		
		map.put("name", "kiran");
		map.put("initial", "hs");
		map.put("team", "ecs");
		map.put("portfolio", "ecomm");
		
		
		
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println("next :" + it.next());
			System.out.println(" Set 1" +  map.entrySet());
			map.entrySet().remove("team");
			System.out.println(" Set 2" +  map.entrySet());
		}
		
		
	HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("name", "kiran");
		map1.put("initial", "hs");
		map1.put("team", "ecs");
		map1.put("portfolio", "ecomm");
		
		
		
		Iterator<Entry<String, String>> it1 = map1.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Map.Entry<String,String> me = it1.next();
			System.out.println("next iii :" + it1.next());
			System.out.println(" Set iii  1" +  map1.entrySet());
			map1.entrySet().remove(me);
			System.out.println(" Set iii 2" +  map1.entrySet());
		}
		
		
		
		

	}

}
