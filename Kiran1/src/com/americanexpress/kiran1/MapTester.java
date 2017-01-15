/**
 * 
 */
package com.americanexpress.kiran1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author Kiran
 *
 */
public class MapTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("name", "kiran");
		map1.put("initial", "hs");
		map1.put("team", "ecs");
		map1.put("portfolio", "ecomm");
		
		
		
		Iterator<String> it1 = map1.keySet().iterator();
		
		while(it1.hasNext())
		{
			System.out.println("next iii :" + it1.next());
			System.out.println(" Set iii  1" +  map1.entrySet());
			map1.keySet().remove("team");
			System.out.println(" Set iii 2" +  map1.entrySet());
		}
		
		
	}

}
