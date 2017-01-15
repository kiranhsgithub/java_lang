/**
 * 
 */
package com.americanexpress.kiran1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kiran
 *
 */
public class StringEqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		
		System.out.println(" hello a == b" + (a == b) );
		System.out.println(c == a);
		c = c.intern();
		System.out.println(c == a);
		
		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add(null);
		System.out.println("set:" + set);
 
	}

}
